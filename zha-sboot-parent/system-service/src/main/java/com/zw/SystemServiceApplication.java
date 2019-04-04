package com.zw;

import com.alibaba.dubbo.config.annotation.Service;
import com.zw.core.custom.MyAnnotationBeanNameGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Created by zha on 2019/3/28.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.zw",nameGenerator = MyAnnotationBeanNameGenerator.class,includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Service.class)})
//@EnableDubbo
public class SystemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemServiceApplication.class, args);
    }

}
