package com.zw.activemq.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.zw.activemq.controller.websocket.WebsocketController;
import com.zw.core.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;


@Component("userPushListener")
public class UserPushListener implements MessageListener {
    protected static final Logger logger = LoggerFactory.getLogger(UserPushListener.class);

    @Override
    public void onMessage(Message message) {
        logger.info("[UserPushListener.onMessage]:begin onMessage.");
        TextMessage textMessage = (TextMessage) message;
        try {
            String jsonStr = textMessage.getText();
            logger.info("[UserPushListener.onMessage]:receive message is," + jsonStr);
            if (jsonStr != null) {
                User info = JSON.parseObject(jsonStr, User.class);
                System.out.println("==============================接受到的用户信息 开始====================================");
                System.out.println(info.toString());
                System.out.println("==============================接受到的用户信息 结束====================================");
                WebsocketController.broadcast("user", jsonStr);
            }
        } catch (JMSException e) {
            logger.error("[UserPushListener.onMessage]:receive message occured an exception", e);
        }
        logger.info("[UserPushListener.onMessage]:end onMessage.");
    }
}

