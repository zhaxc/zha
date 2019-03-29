package com.zw.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.zw.system.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zha
 * @since 2019-03-28
 */
public interface IUserService extends IService<User> {

    User selectOne();

}
