package com.zw.utils;

import com.base.BaseTestCase;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.zw.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/12
 * \* Time: 15:24
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class RedisTempletTest extends BaseTestCase {

    @Autowired
    private RedisTemplate<String,User> redisTemplate;


    ValueOperations<String, User> operations;


    @Before
    public void init() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        泛型的object --》 Json 序列化
//        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//        指定类型的 object --》 Json 序列化
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<User>(User.class));
        operations = redisTemplate.opsForValue();
    }

    @Test
    public void set1() {

        operations.set("user3", new User(3,"zha","15172339107"));
    }

    @Test
    public void set2() {
        /**
         * 指定过期时间
         */
        operations.set("user3", new User(3, "asdfsfd", "15172339107"),15, TimeUnit.SECONDS);
    }

    @Test
    public void set3() {
        /**
         * key 不存在时保存成功 返回true
         * key 存在时保存失败 返回false
         */
        Boolean aBoolean = operations.setIfAbsent("user3", new User(4, "胖子", "15172339107"));
        System.out.println("aBoolean = " + aBoolean);
    }

    @Test
    public void set4() {
        Map<String, User> map = new HashMap<>();
        map.put("user7",new User(4, "dsfdsfsfd", "15172339107"));
        map.put("user6",new User(6, "dsfdssfdsafds", "15172339107"));
        operations.multiSet(map);
        //都不存在时保存成功
        //Boolean aBoolean = operations.multiSetIfAbsent(map);
        //System.out.println("aBoolean = " + aBoolean);
    }

    @Test
    public void get() {
        User user2 = operations.get("user2");
        TestUtil.printJson(user2);
//        Collection<String> keys = new ArrayList<>();
//        keys.add("user1");
//        keys.add("user6");
//        keys.add("user9");
//        List<User> users = operations.multiGet(keys);
//        TestUtil.printJson(users);
    }


    @Test
    public void hash() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        BoundHashOperations<String, String, String> hash3 = redisTemplate.boundHashOps("hash3");
        hash3.put("key1", "1");
        String key1 = hash3.get("key1");
        System.out.println("key1 = " + key1);

        hash3.increment("key1",3);
        String key11 = hash3.get("key1");
        System.out.println("key11 = " + key11);
    }


    @Test
    public void list() {
        redisTemplate.delete("user6");
    }

}