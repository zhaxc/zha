package com.zw.service.impl;

import com.zw.entity.User;
import com.zw.mapper.UserMapper;
import com.zw.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 3072 kB 服务实现类
 * </p>
 *
 * @author zha
 * @since 2017-05-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
