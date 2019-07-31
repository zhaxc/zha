package com.zw;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zha on 2019/3/28.
 */
//@ComponentScan(basePackages = "com.zw",nameGenerator = MyAnnotationBeanNameGenerator.class,
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Service.class),
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = com.alibaba.dubbo.config.annotation.Service.class
//                )})
@EnableDubbo
@SpringBootApplication
public class SystemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemServiceApplication.class, args);
    }

}
