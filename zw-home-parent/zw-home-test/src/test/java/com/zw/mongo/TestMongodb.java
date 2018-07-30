package com.zw.mongo;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.junit.Test;

import java.net.UnknownHostException;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/17
 * \* Time: 15:43
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class TestMongodb {

    @Test
    public void testConnect() {
        try {
//            Mongo mongo = new Mongo("192.168.126.49", 20000);
            Mongo mongo = new MongoClient("192.168.1.29", 27017);
            DB db = mongo.getDB("nrvsp");
            Set<String> collectionNames = db.getCollectionNames();
            for (String collectionName : collectionNames) {
                System.out.println("collectionName = " + collectionName);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}