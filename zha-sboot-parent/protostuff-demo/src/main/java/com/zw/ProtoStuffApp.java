package com.zw;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zw.util.ProtostuffHttpMessageConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 */
@Slf4j
@SpringBootApplication
public class ProtoStuffApp {


    @Bean
    ProtostuffHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtostuffHttpMessageConverter();
    }

    public static void main(String[] args) throws JsonProcessingException {

        log.info(">>>>>>>>>>>>>> ProtoStuffApp 开始初始化 >>>>>>>>>>>>>>");
        SpringApplication.run(ProtoStuffApp.class, args);
        log.info(">>>>>>>>>>>>>> ProtoStuffApp 初始化完成 >>>>>>>>>>>>>>");

    }

}
