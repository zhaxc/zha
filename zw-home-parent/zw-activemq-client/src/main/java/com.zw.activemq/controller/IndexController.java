package com.zw.activemq.controller;

import com.zw.activemq.response.ResultRespone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/21
 * \* Time: 16:39
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public ResultRespone index() {
        ResultRespone respone = new ResultRespone();
        respone.setData("欢迎来到我的界面");
        return respone;
    }

}
