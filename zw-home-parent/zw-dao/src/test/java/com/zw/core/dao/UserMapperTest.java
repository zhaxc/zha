package com.zw.core.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zw.core.model.User;

import java.util.Map;

/**
 * Created by IDEA
 * description ：
 * Author: zhaxc
 * Date: 2017/4/19 13:49
 * Version 1.0
 */
public class UserMapperTest extends SpringDaoTestCase {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testCountByExample() throws Exception {

    }

    @Test
    public void testDeleteByExample() throws Exception {

    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {

    }

    @Test
    public void testInsertSelective() throws Exception {

    }

    @Test
    public void testSelectByExample() throws Exception {
        Map<String, Object> stringObjectMap = userDAO.selcetById(1);
        System.out.println("stringObjectMap = " + stringObjectMap);
        System.out.println(stringObjectMap.get("name"));
    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        User user = userDAO.selectByPrimaryKey(1);
        System.out.println("user = " + user);
    }

    @Test
    public void testUpdateByExampleSelective() throws Exception {

    }

    @Test
    public void testUpdateByExample() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {

    }
}