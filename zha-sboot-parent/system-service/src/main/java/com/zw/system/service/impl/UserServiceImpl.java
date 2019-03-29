package com.zw.system.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zw.system.entity.User;
import com.zw.system.mapper.UserMapper;
import com.zw.system.service.IUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zha
 * @since 2019-03-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User selectOne() {
        return null;
    }
}
