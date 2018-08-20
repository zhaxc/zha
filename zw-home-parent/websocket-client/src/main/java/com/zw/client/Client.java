package com.zw.client;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import java.io.IOException;

/**
 * Created by zha on 2018/8/15.
 */
@ClientEndpoint
public class Client {

    @OnOpen
    public void onOpen(Session session) {
        try {
            session.getBasicRemote().sendText("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println("Client onMessage: " + message);
    }
    @OnClose
    public void onClose() {

    }

}
