package com.zw.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/17
 * \* Time: 17:49
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class MongoBaseImpl<T> implements MongoBase<T> {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void insert(T t, String collectionName) {
        mongoTemplate.insert(t,collectionName);
    }

    @Override
    public T findOne(Map<String, Object> params, String collectionName,Class<T> clazz) {

        CriteriaDefinition criteria = new Criteria();
        Set<Map.Entry<String, Object>> entries = params.entrySet();
        if (!entries.isEmpty()) {
            for (Map.Entry<String, Object> entry : entries) {
                Criteria.where(entry.getKey()).is(entry.getValue());
            }
        }
        return mongoTemplate.findOne(new Query(criteria),clazz, collectionName);

    }

    @Override
    public List<T> findAll(Map<String, Object> params, String collectionName) {
        return null;
    }

    @Override
    public void update(Map<String, Object> params, String collectionName) {

    }

    @Override
    public void createCollection(String collectionName) {

    }

    @Override
    public void remove(Map<String, Object> params, String collectionName) {

    }
}