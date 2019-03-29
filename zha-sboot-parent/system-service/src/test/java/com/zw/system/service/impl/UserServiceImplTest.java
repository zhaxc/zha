package com.zw.system.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zw.system.BaseSystemTest;
import com.zw.system.entity.User;
import com.zw.system.service.IUserService;
import org.junit.Test;

/**
 * Created by zha on 2019/3/29.
 */
public class UserServiceImplTest extends BaseSystemTest{

    @Reference
    private IUserService userService;

    @Test
    public void selectById() {
        User user = this.userService.selectById(1);
        System.out.println("user = " + user);
    }

}