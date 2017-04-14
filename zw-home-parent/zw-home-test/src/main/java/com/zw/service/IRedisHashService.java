package com.zw.service;

import java.util.List;
import java.util.Map;

/**
 * Created by IDEA
 * description ：
 * Author: zhaxc
 * Date: 2017/4/14 16:55
 * Version 1.0
 */
public interface IRedisHashService {

    public  void put(String key,String hashKey,Object hashValue);

    public  void putIfAbsent(String key, String hashKey, Object hashValue);

    public  void putAll(String key, Map<String,Object> map);

    public Object get(String key,String hashKey);

    public <T> T get(String key, String hashKey, Class<T> clazz);

    public List<Object> multiGet(String key, List<String> hashKeys);

}
