package com.lyd.myform;

import com.lyd.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//接收参数-采用驱动模型的方式
public class MyformAction5 extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    public String execute(){
        System.out.println("user===="+user);
        return null;

    }


}
