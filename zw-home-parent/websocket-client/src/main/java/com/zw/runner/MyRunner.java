package com.zw.runner;

import com.zw.client.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Date;

/**
 * Created by zha on 2018/8/15.
 */
@Component
public class MyRunner implements CommandLineRunner {

    private static String uri = "ws://localhost:8080/websocket/444";
    private static Session session;

    @Override
    public void run(String... args) throws Exception {
        connect();
    }

    private void connect() throws DeploymentException, IOException {
        if (session == null) {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            session = container.connectToServer(Client.class, URI.create(uri));
        }
    }

    @Scheduled(cron="*/6 * * * * ?")
    private void scheduled() throws IOException, DeploymentException {
        System.out.println("当前时间是：" + new Date());
        connect();
        sendPing("hello");
    }

    public void sendPing(String message) {
        try {
            if (session != null) {
                session.getAsyncRemote().sendPing(ByteBuffer.wrap(message.getBytes()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
