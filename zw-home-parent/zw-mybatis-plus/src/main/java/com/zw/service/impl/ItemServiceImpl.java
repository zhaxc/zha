package com.zw.service.impl;

import com.zw.entity.Item;
import com.zw.mapper.ItemMapper;
import com.zw.service.IItemService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {
	
}
