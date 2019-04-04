package com.zw.xt.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zw.xt.entity.User;
import com.zw.xt.mapper.UserMapper;
import com.zw.xt.service.IUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zha
 * @since 2019-04-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public String getPackage() {
        return "com.zw.xt.service.impl.UserServiceImpl";
    }

}
