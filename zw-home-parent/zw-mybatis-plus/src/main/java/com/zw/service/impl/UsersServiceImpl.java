package com.zw.service.impl;

import com.zw.entity.Users;
import com.zw.mapper.UsersMapper;
import com.zw.service.IUsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {
	
}
