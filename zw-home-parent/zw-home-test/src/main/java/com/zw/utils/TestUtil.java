package com.zw.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/10
 * \* Time: 13:34
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 测试用工具类
 * \
 */
public class TestUtil {

    public static <T> void printJson(T t) {

        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(dateFormat);

        try {
            mapper.writeValue(System.out,t);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}