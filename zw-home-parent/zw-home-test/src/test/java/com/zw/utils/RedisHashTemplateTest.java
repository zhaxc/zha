package com.zw.utils;

import com.base.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/13
 * \* Time: 10:52
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class RedisHashTemplateTest extends BaseTestCase {

    @Autowired
    private RedisTemplate<String, Object> template;
    @Autowired
    private StringRedisSerializer stringRedisSerializer;
    @Autowired
    private GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer;

    BoundHashOperations<String, String, Object> hash;

    @Before
    public void init() {
        template.setKeySerializer(stringRedisSerializer);
        template.setHashKeySerializer(stringRedisSerializer);
        template.setHashValueSerializer(genericJackson2JsonRedisSerializer);
        hash = template.boundHashOps("hash1");
    }

    @Test
    public void put() {
        //key不能为空
//        hash.put("id",1);
//        hash.put("name", "zha");
        hash.put("score",100);
    }

    @Test
    public void putIfAbsent() {
        //key 非空， 存在false  不存在 true
        Boolean aBoolean = hash.putIfAbsent("shortName", "zz");
        System.out.println("aBoolean = " + aBoolean);
    }

    @Test
    public void putAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("phone", "15172339107");
        map.put("sex", false);
        hash.putAll(map);
    }

    @Test
    public void get() {
        // hashKey 不能为空
        String o = (String) hash.get("name");
        Double score = (Double) hash.get("score");
        System.out.println("o = " + o);
        System.out.println("score = " + score);
    }

    @Test
    public void multiGet() {
        Collection<String> keys = new ArrayList<>();
        keys.add("name");
        keys.add("score");
        keys.add("sex");
        List<Object> objects = hash.multiGet(keys);
        TestUtil.printJson(objects);
    }

    @Test
    public void del() {
        Long score = hash.delete("score");
        System.out.println("score = " + score);
    }

    @Test
    public void incr() {
        Double score = hash.increment("score", -20.4);//返回操作后的结果
        System.out.println("score = " + score);
    }

    @Test
    public void values() {
        List<Object> values = hash.values();
        System.out.println("values = " + values);
    }

    @Test
    public void keys() {
        Set<String> keys = hash.keys();
        System.out.println("keys = " + keys);
    }

    @Test
    public void entries() {
        Map<String, Object> entries = hash.entries();
        for (String s : entries.keySet()) {
            System.out.println( s + " = " + entries.get(s));
        }
    }

    @Test
    public void delete() {
        Long shortName = hash.delete("shortName");
        System.out.println("shortName = " + shortName);//成功1 失败0
    }

    @Test
    public void hasKey() {
        Boolean name = hash.hasKey("name");
        System.out.println("name = " + name);
    }

    @Test
    public void size() {
        Long size = hash.size();
        System.out.println("size = " + size);
    }

    @Test
    public void scan() {
        ScanOptions opt = ScanOptions.scanOptions().match("name").build();
        Cursor<Map.Entry<String, Object>> scan = hash.scan(opt);
        while (scan.hasNext()) {
            Map.Entry<String, Object> next = scan.next();
            System.out.println(next.getKey() + " = " + next.getValue() );
        }
    }




}