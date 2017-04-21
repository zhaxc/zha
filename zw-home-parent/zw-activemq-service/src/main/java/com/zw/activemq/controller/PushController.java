package com.zw.activemq.controller;

import com.zw.activemq.result.ResultRespone;
import com.zw.activemq.service.PushService;
import com.zw.core.domain.Client;
import com.zw.core.domain.News;
import com.zw.core.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/21
 * \* Time: 15:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Controller
@RequestMapping("/push")
public class PushController {

    @Resource(name="userPushService")
    private PushService userPushService;

    @Resource(name="newsPushService")
    private PushService newsPushService;

    @Resource(name="clientPushService")
    private PushService clientPushService;


    /**
     * 用户推送
     * @param info
     * @return
     */
    @RequestMapping(value="/user",method= RequestMethod.POST)
    @ResponseBody
    public ResultRespone userPush(User info){
        ResultRespone respone = new ResultRespone();
        try {
            userPushService.push(info);
            respone.setData(info);
        } catch (Exception e) {
            e.printStackTrace();
            respone = new ResultRespone(false, e.getMessage());
        }
        return respone;
    }

    /**
     * 新闻推送
     * @param info
     * @return
     */
    @RequestMapping(value="/news",method=RequestMethod.POST)
    @ResponseBody
    public  ResultRespone newsPush(News info) {
        ResultRespone respone = new ResultRespone();

        try {
            newsPushService.push(info);
            respone.setData(info);
        } catch (Exception e) {
            e.printStackTrace();
            respone = new ResultRespone(false, e.getMessage());
        }

        return respone;

    }

    /**
     * 客户推送
     * @param info
     * @return
     */
    @RequestMapping(value="/client",method=RequestMethod.POST)
    @ResponseBody
    public ResultRespone clientPush(Client info){
        ResultRespone respone = new ResultRespone();
        try {
            clientPushService.push(info);
            respone.setData(info);
        } catch (Exception e) {
            e.printStackTrace();
            respone = new ResultRespone(false, e.getMessage());
        }
        return respone;
    }

}