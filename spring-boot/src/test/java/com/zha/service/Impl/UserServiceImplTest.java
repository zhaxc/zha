package com.zha.service.Impl;

import com.zha.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Reference;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zha on 2019/4/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Reference
    private IUserService userService;

    @Test
    public void selectListBySQL() throws Exception {


    }

}