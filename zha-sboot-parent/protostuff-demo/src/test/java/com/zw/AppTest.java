package com.zw;

import com.alibaba.fastjson.JSON;
import com.github.kevinsawicki.http.HttpRequest;
import com.zw.entity.User;
import com.zw.util.ProtoBufUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class AppTest 
{
    /**
     * test check
     */
    @Test
    public void check(){
        String body = HttpRequest.post("http://localhost:8081/check").accept("application/json").body();
        assertEquals("ok!", body);
    }

    @Test
    public void test1(){

        User user = User.builder().userId(1).userName("渣渣渣").userTypeId(1).build();

        String body = HttpRequest.post("http://localhost:8081/test").accept("application/x-protobuf")
                .contentType("application/json").send(JSON.toJSONString(user)).body();

        User user1 = ProtoBufUtil.deserializer(body.getBytes(), User.class);
        System.out.println("user1 = " + user1);
        assertEquals(user, user1);
    }

    @Test
    public void test2(){
        String body = HttpRequest.post("http://localhost:8080/test2").body();
        System.out.println("body = " + body);
        String body1 = HttpRequest.post("http://localhost:8081/person").body();
        System.out.println("body1 = " + body1);
        assertEquals(body, body1);
    }

}
