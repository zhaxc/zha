package com.test.api;

import org.junit.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/10
 * \* Time: 15:45
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class StringDemo {

    public static void main(String[] args) {

    }

    @Test
    public void test1(){
        String string = "I am a student.";
        String[] split = string.split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
            if (i == 0){
                result = result + split[i];
            }else {
                result = result + split[i] + " ";
            }
        }
        System.out.println("result = " + result);
    }

    @Test
    public void test2() {
        String string = "abcdef";
        String reverse = reverse(string, 0, 2);
        System.out.println("reverse = " + reverse);

    }

    public String reverse(String string, int from, int end) {
        String x = string.substring(from, end);
        String y = string.substring(end);
        return y + x;
    }
}