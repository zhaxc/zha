package com.zw.service.impl;

import com.base.BaseTestCase;
import com.zw.service.IRedisHashService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by IDEA
 * description ：
 * Author: zhaxc
 * Date: 2017/4/14 17:22
 * Version 1.0
 */
public class RedisHashServiceTest extends BaseTestCase {

    @Autowired
    private IRedisHashService redisHashService;

    @Test
    public void testPut() throws Exception {
//        redisHashService.put("hashKey2","id", 2);
        redisHashService.put("hashKey2","name", "张徐峰");
        redisHashService.put("hashKey2","age", 20);
    }

    @Test
    public void testPut1() throws Exception {

    }

    @Test
    public void testPutIfAbsent() throws Exception {

    }

    @Test
    public void testPutAll() throws Exception {

    }

    @Test
    public void testGet() throws Exception {
        Object o = redisHashService.get("hashKey2", "name");
        System.out.println("o = " + o);
    }

    @Test
    public void testGet1() throws Exception {
        String s = redisHashService.get("hashKey2", "name", String.class);
        System.out.println("s = " + s);
    }

    @Test
    public void testMultiGet() throws Exception {

    }
}