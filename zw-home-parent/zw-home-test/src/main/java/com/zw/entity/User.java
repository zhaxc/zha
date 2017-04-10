package com.zw.entity;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhaxc
 * \* Date: 2017/4/10
 * \* Time: 13:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class User {

    private Integer id;
    private String name;
    private String phone;

    public User() {
    }

    public User(Integer id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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