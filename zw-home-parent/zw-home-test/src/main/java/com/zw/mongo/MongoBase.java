package com.zw.mongo;

import java.util.List;
import java.util.Map;

/**
 * Created by IDEA
 * description ：
 * Author: zhaxc
 * Date: 2017/4/17 17:23
 * Version 1.0
 */
public interface MongoBase<T> {

    //添加
    public void insert(T object,String collectionName);
    //根据条件查找
    public <T> T findOne(Map<String,Object> params,String collectionName,Class<T> clazz);
    //查找所有
    public List<T> findAll(Map<String,Object> params,String collectionName);
    //修改
    public void update(Map<String,Object> params,String collectionName);
    //创建集合
    public void createCollection(String collectionName);
    //根据条件删除
    public void remove(Map<String,Object> params,String collectionName);


}
