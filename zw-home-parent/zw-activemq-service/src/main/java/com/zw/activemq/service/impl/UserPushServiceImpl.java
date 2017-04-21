package com.zw.activemq.service.impl;

import com.alibaba.fastjson.JSON;
import com.zw.activemq.service.PushService;
import com.zw.core.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/21
 * \* Time: 15:43
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service("userPushService")
public class UserPushServiceImpl implements PushService{

    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * 这里是根据MQ配置文件定义的queue来注入的，也就是这里将会把不同的内容推送到不同的queue中
     */
    @Autowired
    @Qualifier("userServiceQueue")
    private Destination destination;


    @Override
    public void push(final Object info) {
        pushExecutor.execute(new Runnable() {
            @Override
            public void run() {
                jmsTemplate.send(destination, new MessageCreator() {
                    public Message createMessage(Session session) throws JMSException {
                        User p = (User) info;
                        return session.createTextMessage(JSON.toJSONString(p));
                    }
                });
            }
        });
    }
}