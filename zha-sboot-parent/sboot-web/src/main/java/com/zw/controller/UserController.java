package com.zw.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.zw.system.entity.User;
import com.zw.system.service.IUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zha
 * @since 2019-03-29
 */
@RestController
@RequestMapping("/system/user")
public class UserController {

    @Reference
    private IUserService userService;

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") String id) {
        try {
            return userService.selectById(1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
