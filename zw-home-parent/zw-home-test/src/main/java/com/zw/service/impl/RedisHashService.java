package com.zw.service.impl;

import com.zw.service.IRedisHashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/14
 * \* Time: 16:56
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service("redisHashService")
public class RedisHashService extends RedisService implements IRedisHashService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

//    {
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

//    }

    @Override
    public void put(String key, String hashKey, Object hashValue) {
        super.setDefaultHashSerializer(redisTemplate);
        redisTemplate.boundHashOps(key).put(hashKey, hashValue);
    }

    @Override
    public void putIfAbsent(String key, String hashKey, Object hashValue) {
        super.setDefaultHashSerializer(redisTemplate);
        redisTemplate.boundHashOps(key).putIfAbsent(hashKey, hashValue);
    }

    @Override
    public void putAll(String key, Map<String, Object> map) {
        super.setDefaultHashSerializer(redisTemplate);
        redisTemplate.boundHashOps(key).putAll(map);
    }

    @Override
    public Object get(String key, String hashKey) {
        super.setDefaultHashSerializer(redisTemplate);
        return redisTemplate.boundHashOps(key).get(hashKey);
    }

    @Override
    public <T> T get(String key, String hashKey, Class<T> clazz) {
        super.setDefaultHashSerializer(redisTemplate);
        Object obj = redisTemplate.boundHashOps(key).get(hashKey);

        if (!ObjectUtils.isEmpty(obj)) {
            return (T) obj;
        }

        return null;

    }

    @Override
    public List<Object> multiGet(String key, List<String> hashKeys) {
        return null;
    }


}