package com.zw.mongo;

import com.zw.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by IDEA
 * description ：
 * Author: zhaxc
 * Date: 2017/4/17 17:24
 * Version 1.0
 */
@Repository("userDao")
public class UserDao extends MongodbBaseDao<User>{

//    @Override
//    protected Class getEntityClass() {
//        return User.class;
//    }

    @Override
    protected String getCollection() {
        return "user";
    }

}
