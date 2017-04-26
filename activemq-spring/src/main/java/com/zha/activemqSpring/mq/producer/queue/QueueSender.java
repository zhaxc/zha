package com.zha.activemqSpring.mq.producer.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * 队列消息生产者，发送消息到队列
 * 
 * @author zhaxc
 * @date 2016年12月21日 上午10:28:08
 * @version 3.0
 */
@Component("queueSender")
public class QueueSender {
	
	@Autowired
	@Qualifier("jmsQueueTemplate")
	private JmsTemplate jmsTemplate;//通过@Qualifier修饰符来注入对应的bean
	
	/**
	 * 发送一条消息到指定的队列（目标）
	 * @param queueName 队列名称
	 * @param message 消息内容
	 */
	public void send(String queueName,final String message){
		jmsTemplate.send(queueName,new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
			
		});
	}
}
