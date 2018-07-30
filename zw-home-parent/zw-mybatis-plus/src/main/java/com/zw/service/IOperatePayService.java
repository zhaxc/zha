package com.zw.service;

import com.zw.entity.OperatePay;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 经营支付 服务类
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
public interface IOperatePayService extends IService<OperatePay> {
    public void batchInsert(List<OperatePay> operatePays);
}
