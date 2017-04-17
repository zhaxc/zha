package com.zw.mongo;

import com.base.BaseTestCase;
import com.zw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Collection;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/17
 * \* Time: 17:10
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class MongoTempleTest extends BaseTestCase{

    @Autowired
    MongoTemplate mongoTemple;

    public void insert() {
//        Collection<? extends Object> user = new User();
//        mongoTemple.insert(user,"users");
    }

}