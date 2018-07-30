package com.zw.service.impl;

import com.zw.entity.Users;
import com.zw.service.IUsersService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.BaseTest;

import java.util.Date;

/**
 * Created by zha on 2017/7/25.
 */
public class UsersServiceImplTest extends BaseTest {

    @Autowired
    private IUsersService usersService;

    @Test
    public void testRetBool() throws Exception {

    }

    @Test
    public void testCurrentModleClass() throws Exception {

    }

    @Test
    public void testSqlSessionBatch() throws Exception {

    }

    @Test
    public void testSqlStatement() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
        Users user = new Users();
        user.setName("zw");
        user.setIndate(new Date());
        this.usersService.insert(user);
    }

    @Test
    public void testInsertAllColumn() throws Exception {

    }

    @Test
    public void testInsertBatch() throws Exception {

    }

    @Test
    public void testInsertBatch1() throws Exception {

    }

    @Test
    public void testInsertOrUpdate() throws Exception {

    }

    @Test
    public void testInsertOrUpdateBatch() throws Exception {

    }

    @Test
    public void testInsertOrUpdateBatch1() throws Exception {

    }

    @Test
    public void testDeleteById() throws Exception {

    }

    @Test
    public void testDeleteByMap() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testDeleteBatchIds() throws Exception {

    }

    @Test
    public void testUpdateById() throws Exception {

    }

    @Test
    public void testUpdateAllColumnById() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testUpdateBatchById() throws Exception {

    }

    @Test
    public void testUpdateBatchById1() throws Exception {

    }

    @Test
    public void testSelectById() throws Exception {

    }

    @Test
    public void testSelectBatchIds() throws Exception {

    }

    @Test
    public void testSelectByMap() throws Exception {

    }

    @Test
    public void testSelectOne() throws Exception {

    }

    @Test
    public void testSelectMap() throws Exception {

    }

    @Test
    public void testSelectObj() throws Exception {

    }

    @Test
    public void testSelectCount() throws Exception {

    }

    @Test
    public void testSelectList() throws Exception {

    }

    @Test
    public void testSelectPage() throws Exception {

    }

    @Test
    public void testSelectMaps() throws Exception {

    }

    @Test
    public void testSelectObjs() throws Exception {

    }

    @Test
    public void testSelectMapsPage() throws Exception {

    }

    @Test
    public void testSelectPage1() throws Exception {

    }
}