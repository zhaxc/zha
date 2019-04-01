package com.zw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zw.system.service.IDemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoConsumerController
 * 消费者控制层
 * @author xiaoze
 * @date 2018/6/7
 */
@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}")
    private IDemoService demoService;

    @RequestMapping(value = "/sayHello/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }


}
