package com.lyd.myform;

import com.lyd.domain.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

//接收参数-提供表达式方式
public class MyformAction4 extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String execute(){
        System.out.println(user);

        return null;

    }
}
