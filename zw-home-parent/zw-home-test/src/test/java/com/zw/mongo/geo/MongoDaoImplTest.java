package com.zw.mongo.geo;

import com.base.BaseTestCase;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zha on 2017/8/12.
 */
public class MongoDaoImplTest extends BaseTestCase {

    @Autowired
    private MongoDaoImpl mongoDao;

    @Test
    public void testFindOne() throws Exception {
        DBObject query = new BasicDBObject();
        Point point = new Point();
        point.setLng(118.783799);
        point.setLat(31.979234);
        int limit = 5;
        Long maxDistance = 5000L; // 米
        List<DBObject> list = mongoDao.geoNear("point.test", query, point, limit, maxDistance);
        for(DBObject obj : list)
            System.out.println(obj);
    }

    @Test
    public void testFind() throws Exception {

    }

    @Test
    public void testFind1() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testSave() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testCount() throws Exception {

    }

    @Test
    public void testDistinct() throws Exception {

    }

    @Test
    public void testGeoNear() throws Exception {

    }

    @Test
    public void testWithinCircle() throws Exception {

    }

    @Test
    public void testNearSphere() throws Exception {

    }

    @Test
    public void testWithinPolygon() throws Exception {

    }

    @Test
    public void testWithinMultiPolygon() throws Exception {

    }

    @Test
    public void testWithinBox() throws Exception {

    }
}