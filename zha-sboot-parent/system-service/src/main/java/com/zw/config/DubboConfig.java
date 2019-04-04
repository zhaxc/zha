package com.zw.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zha on 2019/4/3.
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.zw.*.service.impl")
//@ImportResource({"classpath:dubbo-system-provider.xml"})
public class DubboConfig {

}
