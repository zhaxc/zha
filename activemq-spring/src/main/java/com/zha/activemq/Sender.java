package com.zha.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 消息发送者
 * @author zhaxc
 * @date 2016年12月20日 下午4:13:32
 * @version 3.0
 */
public class Sender {
	private static final int SEND_NUMBER = 5;

	public static void main(String[] args) {
		// ConnectionFactory : 连接工厂，JMS用于创建连接
		ConnectionFactory connectionFactory;
		// Provider 的连接
		Connection connection = null;
		// Session : 一个发送或接收消息的线程
		Session session;
		// Destination : 消息的目的地；消息发送给谁
		Destination destination;
		// MessageProducer：消息发送者
		MessageProducer producer;
		// TextMessage message;

		// 构造ConnectionFactory实例对象，此处采用ActiveMq的实现jar
		connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
				ActiveMQConnection.DEFAULT_PASSWORD, "tcp://192.168.126.19:61616");

		try {
			// 构造从工厂得到连接对象
			connection = connectionFactory.createConnection();
			// 启动
			connection.start();
			// 获取操作连接
			session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			// 获取session注意参数值xingbo.xu-queue是一个服务器的queue，须在在ActiveMq的console配置
			destination = session.createQueue("FirstQueue");
			// 得到消息生成者【发送者】
			producer = session.createProducer(destination);
			// 设置不持久化，此处学习，实际根据项目决定
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			// 构造消息，此处写死，项目就是参数，或者方法获取
			sendMessage(session, producer);
			session.commit();
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != connection)
					connection.close();
			} catch (Throwable ignore) {
			}
		}
	}

	private static void sendMessage(Session session, MessageProducer producer) throws JMSException {

		for (int i = 0; i < SEND_NUMBER; i++) {
			TextMessage message = session.createTextMessage("ActiveMq 发送的消息" + i);
			System.out.println("发送消息：" + "ActiveMq 发送的消息" + i);
			producer.send(message);
		}

	}
}
