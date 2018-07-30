package com.zw.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zw.entity.OperatePay;
import com.zw.entity.OrderCancel;
import com.zw.entity.OrderCreate;
import com.zw.entity.OrderMatch;
import com.zw.service.IOperatePayService;
import com.zw.service.IOrderCancelService;
import com.zw.service.IOrderCreateService;
import com.zw.service.IOrderMatchService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.BaseTest;

import java.util.Date;
import java.util.List;

/**
 * Created by zha on 2017/7/25.
 */
public class OrderCreateServiceImplTest extends BaseTest {

    @Autowired
    private IOrderCreateService orderCreateService;
    @Autowired
    private IOrderMatchService orderMatchService;
    @Autowired
    private IOrderCancelService orderCancelService;
    @Autowired
    private IOperatePayService operatePayService;


    @Test
    public void testInsert() throws Exception {
        long start = new Date().getTime();
        Long first = 20170001000000L;
        for (int i = 1; i <= 12; i++) {
            first += 100000000;
            for (int j = 1; j < 3; j++) {
                OrderCreate temp = new OrderCreate();
                temp.setOrderId("order_" + i + "_" + j);
                temp.setOrderTime(first);
                this.orderCreateService.insert(temp);
            }

        }

        long end= new Date().getTime();
        System.out.println("用时:" + (end - start));
    }

    @Test
    public void testInsertOrUpdate() throws Exception {
        long start = new Date().getTime();
        Long first = 20170001000000L;
        for (int i = 1; i <= 12; i++) {
            first += 100000000;
            for (int j = 1; j < 3; j++) {
                OrderMatch temp = new OrderMatch();
                temp.setOrderId("order_" + i + "_" + j);
                temp.setDistributeTime(first);
                this.orderMatchService.insert(temp);
            }

        }

        long end= new Date().getTime();
        System.out.println("用时:" + (end - start));
    }

    @Test
    public void testInsertOrUpdateBatch() throws Exception {
        long start = new Date().getTime();
        Long first = 20170001000000L;
        for (int i = 1; i <= 12; i++) {
            first += 100000000;
            for (int j = 1; j < 3; j++) {
                OrderCancel temp = new OrderCancel();
                temp.setOrderId("order_" + i + "_" + j);
                temp.setCancelTime(first);
                this.orderCancelService.insert(temp);
            }

        }
    }

    @Test
    public void testInsertOrUpdateBatch1() throws Exception {
        long start = new Date().getTime();
        Long first = 20170001000000L;
        for (int i = 1; i <= 12; i++) {
            first += 100000000;
            for (int j = 1; j < 3; j++) {
                OperatePay temp = new OperatePay();
                temp.setOrderId("order_" + i + "_" + j);
                temp.setPayTime(first);
                this.operatePayService.insert(temp);
            }

        }
    }

    @Test
    public void testDeleteById() throws Exception {

    }

    @Test
    public void testDeleteByMap() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testDeleteBatchIds() throws Exception {

    }

    @Test
    public void testUpdateById() throws Exception {

    }

    @Test
    public void testUpdateAllColumnById() throws Exception {

    }

    /*分片列不能被修改 */
    @Test
    public void testUpdate() throws Exception {
        OrderCreate entity = new OrderCreate();
        entity.setCompanyId("updateAgain");
//        entity.setOrderTime(20170209000206L); //Sharding column can't be updated
        this.orderCreateService.update(entity, new EntityWrapper<OrderCreate>().eq("order_id","order02"));
    }

    @Test
    public void testUpdateBatchById() throws Exception {

    }

    @Test
    public void testUpdateBatchById1() throws Exception {

    }

    @Test
    public void testSelectById() throws Exception {

    }

    @Test
    public void testSelectBatchIds() throws Exception {
        List<OrderCreate> orderCreates = this.orderCreateService.selectList(new EntityWrapper<OrderCreate>().eq("order_id","order03"));
        System.out.println("orderCreates = " + JSON.toJSONString(orderCreates));
    }

    @Test
    public void testSelectByMap() throws Exception {

    }

    @Test
    public void testSelectOne() throws Exception {

    }

    @Test
    public void testSelectMap() throws Exception {

    }

    @Test
    public void testSelectObj() throws Exception {

    }

    @Test
    public void testSelectCount() throws Exception {

    }

    @Test
    public void testSelectList() throws Exception {

    }

    @Test
    public void testSelectPage() throws Exception {

    }

    @Test
    public void testSelectMaps() throws Exception {

    }

    @Test
    public void testSelectObjs() throws Exception {

    }

    @Test
    public void testSelectMapsPage() throws Exception {

    }

    @Test
    public void testSelectPage1() throws Exception {

    }
}