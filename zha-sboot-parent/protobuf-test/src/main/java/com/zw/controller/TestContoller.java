package com.zw.controller;

import com.zw.model.PersonMsg;
import com.zw.model.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestContoller {

    @RequestMapping("test1")
    @ResponseBody
    public String test1() {
        return "hello world";
    }

    @PostMapping("test2")
    @ResponseBody
    public PersonMsg.Person test2() {
        PersonMsg.Person.Builder personBuilder = PersonMsg.Person.newBuilder();
        personBuilder.setId(1);
        personBuilder.setName("渣渣渣");
        personBuilder.setEmail("xxg@163.com");
        personBuilder.addFriends("Friend A");
        personBuilder.addFriends("Friend B");
        PersonMsg.Person person = personBuilder.build();
        return person;
    }


    @RequestMapping(value = "/test3", method = RequestMethod.POST)
    void test3(RequestEntity<PersonMsg.Person> requestEntity) {

        PersonMsg.Person person = requestEntity.getBody();
        System.out.println("person = " + person);
    }

    @PostMapping("test4")
    @ResponseBody
    public User test4() {
        User user = User.builder().id(1).name("渣渣渣").age(18).build();
        return user;
    }



}
