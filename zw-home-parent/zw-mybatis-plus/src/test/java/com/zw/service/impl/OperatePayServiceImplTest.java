package com.zw.service.impl;

import com.zw.entity.OperatePay;
import com.zw.service.IOperatePayService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.BaseTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zha on 2017/7/28.
 */
public class OperatePayServiceImplTest extends BaseTest{

    @Autowired
    private IOperatePayService operatePayService;

    @Test
    public void testBatchInsert() throws Exception {
        long start = new Date().getTime();
        Long first = 20170001000000L;
        List<OperatePay> operatePay = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            first += 100000000;
            for (int j = 1; j < 10001; j++) {
                OperatePay temp = new OperatePay();
                temp.setOrderId("order" + j);
                temp.setDepTime(first);
                operatePay.add(temp);
            }

        }
        this.operatePayService.batchInsert(operatePay);
        long end= new Date().getTime();
        long l = (end - start) / 1000;
        System.out.println("用时:" + l + "秒");

    }


}