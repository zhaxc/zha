package com.zw.mapper;

import com.zw.entity.OperatePay;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
  * 经营支付 Mapper 接口
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
public interface OperatePayMapper extends BaseMapper<OperatePay> {
    public void batchInsert(@Param("records")List<OperatePay> operatePays);
}