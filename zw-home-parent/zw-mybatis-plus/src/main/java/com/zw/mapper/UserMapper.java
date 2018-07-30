package com.zw.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zw.entity.User;

import java.util.List;
import java.util.Map;

/**
 * <p>
  * InnoDB free: 3072 kB Mapper 接口
 * </p>
 *
 * @author zha
 * @since 2017-05-14
 */
public interface UserMapper extends BaseMapper<User> {
    List<Map<String, Object>> selectByForm();
}