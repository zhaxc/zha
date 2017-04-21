package com.zw.activemq.service.impl;

import com.alibaba.fastjson.JSON;
import com.zw.activemq.service.PushService;
import com.zw.core.domain.Client;
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
 * \* Time: 15:42
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service("clientPushService")
public class ClientPushServiceImpl implements PushService{

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    @Qualifier("clientServiceQueue")
    private Destination destination;

    @Override
    public void push(final Object info) {
        pushExecutor.execute(new Runnable() {
            @Override
            public void run() {
                jmsTemplate.send(destination, new MessageCreator() {
                    @Override
                    public Message createMessage(Session session) throws JMSException {

                        Client c = (Client) info;

                        return session.createTextMessage(JSON.toJSONString(c));

                    }
                });
            }
        });
    }

}