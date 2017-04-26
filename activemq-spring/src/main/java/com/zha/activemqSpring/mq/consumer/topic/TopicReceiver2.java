package com.zha.activemqSpring.mq.consumer.topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

/**
 * Topic消息监听器
 * 
 * @author zhaxc
 * @date 2016年12月21日 上午10:18:19
 * @version 3.0
 */
@Component
public class TopicReceiver2 implements MessageListener {

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("TopicReceiver2接收到消息:" + ((TextMessage) message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}

}
