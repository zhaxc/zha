package com.zw.xt.service;

import com.zw.xt.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zha
 * @since 2019-04-02
 */
public interface IUserService extends IService<User> {
    String getPackage();
}
