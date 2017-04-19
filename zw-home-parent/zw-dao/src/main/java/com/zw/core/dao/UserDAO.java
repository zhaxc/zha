package com.zw.core.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/19
 * \* Time: 14:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Repository("userMapperExt")
public interface UserDAO extends UserMapper {

    Map<String, Object> selcetById(@Param("id") Integer id);



}