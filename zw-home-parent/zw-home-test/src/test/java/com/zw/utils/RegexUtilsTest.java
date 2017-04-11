package com.zw.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IDEA
 * description ：
 * Author: zhaxc
 * Date: 2017/4/11 15:32
 * Version 1.0
 */
public class RegexUtilsTest {

    @Test
    public void testCheckEmail() throws Exception {

    }

    @Test
    public void testCheckIdCard() throws Exception {
        boolean b = RegexUtils.checkIdCard("");
        System.out.println("b = " + b);
    }

    @Test
    public void testCheckMobile() throws Exception {

    }

    @Test
    public void testCheckPhone() throws Exception {

    }

    @Test
    public void testCheckDigit() throws Exception {

    }

    @Test
    public void testCheckDecimals() throws Exception {

    }

    @Test
    public void testCheckBlankSpace() throws Exception {

    }

    @Test
    public void testCheckChinese() throws Exception {

    }

    @Test
    public void testCheckBirthday() throws Exception {

    }

    @Test
    public void testCheckURL() throws Exception {

    }

    @Test
    public void testGetDomain() throws Exception {

    }

    @Test
    public void testCheckPostcode() throws Exception {

    }

    @Test
    public void testCheckIpAddress() throws Exception {

    }
}