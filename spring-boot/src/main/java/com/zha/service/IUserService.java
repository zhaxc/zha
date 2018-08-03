package com.zha.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.zha.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jack
 * @since 2018-08-03
 */
public interface IUserService extends IService<User> {
    boolean deleteAll();

    List<User> selectListBySQL();

    Page<User> selectUserPage(Page<User> page);

}
