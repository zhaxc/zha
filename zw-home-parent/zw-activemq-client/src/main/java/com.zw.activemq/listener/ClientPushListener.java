package com.zw.activemq.listener;

import com.alibaba.fastjson.JSON;

import com.zw.activemq.controller.websocket.WebsocketController;
import com.zw.core.domain.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Component("clientPushListener")
public class ClientPushListener implements MessageListener {
    protected static final Logger logger = LoggerFactory.getLogger(ClientPushListener.class);

    @Override
    public void onMessage(Message message) {
        logger.info("[ClientPushListener.onMessage]:begin onMessage.");
        TextMessage textMessage = (TextMessage) message;
        try {
            String jsonStr = textMessage.getText();
            logger.info("[ClientPushListener.onMessage]:receive message is," + jsonStr);
            if (jsonStr != null) {
                Client info = JSON.parseObject(jsonStr, Client.class);
                System.out.println("==============================接受到的客户信息 开始====================================");
                System.out.println(info.toString());
                System.out.println("==============================接受到的客户信息 结束====================================");
                WebsocketController.broadcast("client", jsonStr);
            }
        } catch (JMSException e) {
            logger.error("[ClientPushListener.onMessage]:receive message occured an exception", e);
        }
        logger.info("[ClientPushListener.onMessage]:end onMessage.");
    }
}

