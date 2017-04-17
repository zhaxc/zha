package com.zw.mongo;

import com.zw.entity.User;
import org.springframework.stereotype.Repository;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/17
 * \* Time: 17:25
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Repository("userDaoImpl")
public class UserDaoImpl extends MongoBaseImpl<User> implements UserDao {


}