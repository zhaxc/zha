package com.zw.utils;

import com.base.BaseTestCase;
import com.zw.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IDEA
 * description ：
 * Author: zhaxc
 * Date: 2017/4/12 14:09
 * Version 1.0
 */
public class SpringRedisUtilTest extends BaseTestCase {

    @Test
    public void testSave() throws Exception {
        User user = new User(1,"ss","1111111111");
        SpringRedisUtil.save("user", user);
    }

    @Test
    public void testGet() throws Exception {
        User user = SpringRedisUtil.get("user", User.class);
        TestUtil.printJson(user);
    }

    @Test
    public void testDel() {
        SpringRedisUtil.delete("user");
    }


}