package com.zw.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.zw.system.entity.User;
import com.zw.system.service.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Reference
    private com.zw.xt.service.IUserService xtUserService;

    @ApiOperation(value = "获取用户", notes = "根据id获取用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "String")
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") String id) {
        try {
            System.out.println("userService = " + userService.getPackage());
            System.out.println("xtUserService = " + xtUserService.getPackage());
            return userService.selectById(1);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
