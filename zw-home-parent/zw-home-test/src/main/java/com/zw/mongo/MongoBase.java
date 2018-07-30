package com.zw.mongo;

import org.springframework.data.mongodb.repository.Query;

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


    /**
     * 添加
     * @param object
     */
    void insert(T object);

    /**
     * 保存（主键相同则更新）
     * @param object
     */
    void save(T object);

    /**
     * 根据条件查找
     * @return
     */
     List<T> find(Query query);

    /**
     * 根据条件查一个
     * @param params
     * @return
     */
    T findOne(Map<String,Object> params);

    /**
     * 根据条件查询
     * @param t
     * @return
     */
    public List<T> findByCondition(T t);


    /**
     * 查所有
     * @return
     */
    List<T> findAll();
    //修改
    void update(Map<String,Object> params,String collectionName);
    //创建集合
    void createCollection(String collectionName);
    //根据条件删除
    void remove(Map<String,Object> params,String collectionName);


}
