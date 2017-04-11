package com.test.api;

import org.junit.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhaxc
 * \* Date: 2017/4/10
 * \* Time: 11:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class RegexDemo {

    String regex;
    /**
     * + 号代表前面的字符必须至少出现一次（1次或多次）
     */
    @Test
    public void test1(){
        regex = "runoo+b";
        System.out.println("runob".matches(regex));
        System.out.println("runoob".matches(regex));
        System.out.println("runooooob".matches(regex));
    }

    /**
     *  * 号代表前面字符可以不出现，也可以出现一次或者多次（0次、或1次、或多次）
     */
    @Test
    public void test2() {
        regex = "runoo*b";
        System.out.println("runob".matches(regex));
        System.out.println("runoob".matches(regex));
        System.out.println("runoooob".matches(regex));
    }

    /**
     * ? 问号代表前面的字符最多只可以出现一次（0次、或1次）
     */
    @Test
    public void test3() {
        regex = "colou?r";
        System.out.println("color".matches(regex));
        System.out.println("colour".matches(regex));
        System.out.println("colouur".matches(regex));
    }


    @Test
    public void test4() {
        regex = "\\d|X|x";
        System.out.println("x".matches(regex));
    }

    /**
     * \w 匹配包括下划线的任何单词字符。等价于'[A-Za-z0-9_]'。
     * [\w-] '[A-Za-z0-9_]' 和 - 中的任意字符
     */
    @Test
    public void test5() {
        regex = "^http://([\\w-]+\\.)+[\\w-]+$";
        System.out.println("http://__--.d13.com".matches(regex));
    }


}