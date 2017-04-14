package com.zw.utils;

import com.base.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/12
 * \* Time: 18:09
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class StringTemplateTest extends BaseTestCase {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private StringRedisSerializer stringRedisSerializer;

    ValueOperations<String, String> operations;

    @Before
    public void init(){
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setValueSerializer(stringRedisSerializer);
        operations = redisTemplate.opsForValue();
    }


    /**
     * 用于统计点击量，访问量
     */
    @Test
    public void incr() {

        //operations.set("aa","1");
        operations.increment("aa", 1.4);
        String aa = operations.get("aa");
        System.out.println("aa = " + aa);

    }

    @Test
    public void set() {
        ValueOperations<String, String> operations = redisTemplate.opsForValue();
        operations.set("cc", "你好");
    }
}