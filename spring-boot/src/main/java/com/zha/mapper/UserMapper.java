package com.zha.mapper;

import com.baomidou.mybatisplus.annotations.SqlParser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.zha.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Jack
 * @since 2018-08-03
 */
public interface UserMapper extends BaseMapper<User> {

    int deleteAll();

    @SqlParser(filter = true)
    @Select("select id , name, age from user")
    List<User> selectListBySQL();

    List<User> selectUserList(Pagination page);

}
