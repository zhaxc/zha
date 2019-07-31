package com.zw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

/**
 * Hello world!
 * @author zha
 */
@SpringBootApplication
public class ProtoBufApp {

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }

    private static Logger _logger = LoggerFactory.getLogger(ProtoBufApp.class);

    public static void main(String[] args) {
        _logger.info(">>>>>>>>>>>>>> ProtoBufApp 开始初始化 >>>>>>>>>>>>>>");
        SpringApplication.run(ProtoBufApp.class, args);
        _logger.info(">>>>>>>>>>>>>> ProtoBufApp 初始化完成 >>>>>>>>>>>>>>");
    }
}
