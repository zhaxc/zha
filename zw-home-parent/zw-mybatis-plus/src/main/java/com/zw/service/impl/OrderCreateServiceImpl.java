package com.zw.service.impl;

import com.zw.entity.OrderCreate;
import com.zw.mapper.OrderCreateMapper;
import com.zw.service.IOrderCreateService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单发起 服务实现类
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
@Service
public class OrderCreateServiceImpl extends ServiceImpl<OrderCreateMapper, OrderCreate> implements IOrderCreateService {
	
}
