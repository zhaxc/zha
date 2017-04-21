package com.zw.activemq.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/21
 * \* Time: 15:42
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface PushService {

    public final ExecutorService pushExecutor = Executors.newFixedThreadPool(10);

    public void push(Object info);

}