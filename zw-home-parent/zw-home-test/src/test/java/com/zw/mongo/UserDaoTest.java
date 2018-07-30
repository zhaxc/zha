package com.zw.mongo;

import com.base.BaseTestCase;
import com.zw.entity.User;
import com.zw.utils.TestUtil;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zha on 2017/8/4.
 */
public class UserDaoTest extends BaseTestCase {

    @Autowired
    private UserDao userDao;

    @Test
//    @Ignore
    public void testSave() throws Exception {

        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setUserId("user"+i);
            user.setName("name" + i);
            user.setPhone("phone" + i);
            this.userDao.save(user);
        }


    }

    @Test
    @Ignore
    public void testDeleteById() throws Exception {
        User user = new User();
        user.setUserId("user5");
        this.userDao.deleteById(user);
    }

    @Test
    @Ignore
    public void testDeleteByCondition() throws Exception {
        User user = new User();
        user.setName("查");
        this.userDao.deleteByCondition(user);
    }

    @Test
    @Ignore
    public void testUpdate() throws Exception {
        this.userDao.update(new Query(new Criteria().where("name").is("cha")), Update.update("phone","14523322"));
    }

    @Test
    @Ignore
    public void testUpdateByPrimaryKey() throws Exception {
        User user = new User();
//        user.setUserId("user3");
//        user.setName("zhaxc");
        user.setPhone("myPhone");
        this.userDao.updateByPrimaryKey("name", "xc", user);
    }

    @Test
    @Ignore
    public void testFind() throws Exception {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is("xc"));
        List<User> users = this.userDao.find(query);
        TestUtil.printJson(users);
    }

    @Test
//    @Ignore
    public void testFindByCondition() throws Exception {
        User param = new User();
//        param.setName("user1");
        param.setPhone("3");
        List<User> byCondition = this.userDao.findByCondition(param);
        TestUtil.printJson(byCondition);
    }

    @Test
    @Ignore
    public void testFindOne() throws Exception {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is("xc"));
        List<User> users = this.userDao.find(query);
        User one = this.userDao.findOne(query);
        TestUtil.printJson(one);
    }

    @Test
    public void testGet() throws Exception {
        User user3 = this.userDao.getByPrimaryKey("user3");
        TestUtil.printJson(user3);
    }

    @Test
    public void testGet1() throws Exception {

    }

    @Test
    public void testGetMongoTemplate() throws Exception {

    }

    @Test
    public void testGetEntityClass() throws Exception {

    }

    @Test
    public void testFindPageByCondition() throws Exception {

        User param = new User();
        param.setPhone("1");
        Sort.Order userId = new Sort.Order(Sort.Direction.DESC, "name");
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(userId);
        List<User> pageByCondition = this.userDao.findPageByCondition(param, 4, 5,sorts);
        long l = this.userDao.countByCondition(param);
        System.out.println("l = " + l);
        TestUtil.printJson(pageByCondition);

    }
}