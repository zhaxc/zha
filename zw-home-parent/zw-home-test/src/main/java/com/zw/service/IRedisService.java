package com.zw.service;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/14
 * \* Time: 17:08
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface IRedisService {

    /**
     * 设置默认哈希序列号工具
     * @param redisTemplate
     */
    public void setDefaultHashSerializer(RedisTemplate redisTemplate);

}