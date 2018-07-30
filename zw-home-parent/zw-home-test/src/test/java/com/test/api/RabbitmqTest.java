package com.test.api;

import com.rabbitmq.client.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by zha on 2017/7/19.
 */
public class RabbitmqTest {

    private final static String QUEUE_NAME = "hello";

    Channel channel;
    Connection connection;

    @Before
    public void init() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.1.19");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("123456");

        connection = factory.newConnection();
        channel = connection.createChannel();

    }

    @Test
    public void creatQue() throws IOException {
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
    }

    @Test
    public void send() throws IOException {
        String message = "人民币!";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");

    }

    @Test
    public void consume() throws IOException, InterruptedException {
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        QueueingConsumer consumer = new QueueingConsumer(channel);
        channel.basicConsume(QUEUE_NAME, true, consumer);

        while (true) {
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println(" [x] Received '" + message + "'");
        }

    }


    @After
    public void close() throws IOException, TimeoutException {
        channel.close();
        connection.close();
    }
}
