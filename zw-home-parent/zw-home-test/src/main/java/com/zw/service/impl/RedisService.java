package com.zw.service.impl;

import com.zw.service.IRedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/14
 * \* Time: 17:08
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class RedisService implements IRedisService {

    @Override
    public void setDefaultHashSerializer(RedisTemplate redisTemplate) {

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

    }

}