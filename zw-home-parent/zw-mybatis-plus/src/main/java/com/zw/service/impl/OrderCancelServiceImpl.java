package com.zw.service.impl;

import com.zw.entity.OrderCancel;
import com.zw.mapper.OrderCancelMapper;
import com.zw.service.IOrderCancelService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单撤销 服务实现类
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
@Service
public class OrderCancelServiceImpl extends ServiceImpl<OrderCancelMapper, OrderCancel> implements IOrderCancelService {
	
}
