package com.zw;

import com.zw.entity.Person;
import com.zw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @PostMapping("check")
    @ResponseBody
    public String check() {
        return "ok!";
    }

    @PostMapping("test")
    @ResponseBody
    public User test(@RequestBody User user) {
        User build = User.builder().userId(user.getUserId()).userName(user.getUserName()).userTypeId(user.getUserTypeId()).build();
        return build;
    }

    @PostMapping("person")
    @ResponseBody
    public Person person() {
        List<String> friends = new ArrayList<>();
        friends.add("Friend A");
        friends.add("Friend B");
        Person build = Person.builder().id(1).name("渣渣渣").email("xxg@163.com").friends(friends).build();
        return build;
    }

}
