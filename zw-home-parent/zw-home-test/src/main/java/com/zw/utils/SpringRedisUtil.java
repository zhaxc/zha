package com.zw.utils;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA. 
 * \* User: java \* Date: 2017/4/12 
 * \* Time: 14:01 
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 
 */
public class SpringRedisUtil {

	@SuppressWarnings("unchecked")
	private static RedisTemplate<Serializable, Serializable> redisTemplate = (RedisTemplate<Serializable, Serializable>) ApplicationContextUtil
			.getBean("redisTemplate");

	public static void save(final String key, Object value) {

		final byte[] vbytes = SerializeUtil.serialize(value);
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.set(redisTemplate.getStringSerializer().serialize(key), vbytes);
				return null;
			}
		});
	}

	public static <T> T get(final String key, Class<T> elementType) {
		return redisTemplate.execute(new RedisCallback<T>() {
			@Override
			public T doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keybytes = redisTemplate.getStringSerializer().serialize(key);
				if (connection.exists(keybytes)) {
					byte[] valuebytes = connection.get(keybytes);
					@SuppressWarnings("unchecked")
					T value = (T) SerializeUtil.unserialize(valuebytes);
					return value;
				}
				return null;
			}
		});
	}

	public static void delete(final String key) {
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.del(redisTemplate.getStringSerializer().serialize(key));
				return null;
			}
		});
	}
}