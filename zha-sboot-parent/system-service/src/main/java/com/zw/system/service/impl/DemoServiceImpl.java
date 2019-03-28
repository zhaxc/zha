package com.zw.system.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zw.system.service.IDemoService;

/**
 * Created by zha on 2019/3/28.
 */
@Service
public class DemoServiceImpl implements IDemoService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
