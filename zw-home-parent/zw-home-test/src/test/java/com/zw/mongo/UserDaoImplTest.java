package com.zw.mongo;

import com.base.BaseTestCase;
import com.zw.entity.User;
import com.zw.utils.TestUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by IDEA
 * description ：
 * Author: zhaxc
 * Date: 2017/4/17 17:28
 * Version 1.0
 */
public class UserDaoImplTest extends BaseTestCase {

    @Autowired
    UserDaoImpl userDaoImpl;

    @Test
    public void testInsert() throws Exception {
        userDaoImpl.insert(new User(1, "查", "15172339107"),"zw");
    }

    @Test
    public void testFindOne() throws Exception {
        HashMap<String, Object> params = new HashMap<>();
       /* params.put("id", 1);
        params.put("name","查");*/
        User zw = userDaoImpl.findOne(params, "zw", User.class);
        TestUtil.printJson(zw);
    }

    @Test
    public void testFindAll() throws Exception {
        Map<String, Object> param = new HashMap<>();
        List<User> zw = userDaoImpl.findAll(param, "zw");
        TestUtil.printJson(zw);
    }

    @Test
    public void testUpdate() throws Exception {
        Map<String,Object> param = new HashMap<>();
        userDaoImpl.update(param,"zw");
    }

    @Test
    public void testCreateCollection() throws Exception {
        userDaoImpl.createCollection("zw");
    }

    @Test
    public void testRemove() throws Exception {

    }
}