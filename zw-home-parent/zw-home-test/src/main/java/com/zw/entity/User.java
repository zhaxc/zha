package com.zw.entity;

import com.zw.enums.QueryField;
import com.zw.enums.QueryType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhaxc
 * \* Date: 2017/4/10
 * \* Time: 13:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Document
public class User implements Serializable{

    @Id
    @QueryField
    private String userId;

    @QueryField
    private String name;

    @QueryField(type = QueryType.LIKE, attribute = "phone")
    private String phone;

    public User() {
    }

    public User(String userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}