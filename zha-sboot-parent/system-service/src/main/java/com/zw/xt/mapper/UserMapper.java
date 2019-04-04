package com.zw.xt.mapper;

import com.zw.xt.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zha
 * @since 2019-04-02
 */
public interface UserMapper extends BaseMapper<User> {
    User getOne();
}
