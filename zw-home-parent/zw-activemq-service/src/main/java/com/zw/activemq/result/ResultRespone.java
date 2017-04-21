package com.zw.activemq.result;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/21
 * \* Time: 15:43
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ResultRespone implements Serializable{

    private static final long serialVersionUID = 1L;

    private boolean success = true;

    private Object data;

    private String msg;

    public ResultRespone(){}

    public ResultRespone(boolean success,String msg){
        this.success = success;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}