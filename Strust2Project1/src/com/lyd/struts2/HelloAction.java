package com.lyd.struts2;

public class HelloAction {
    public String execute(){
        System.out.println("我已经接收到了请求1");
        return "success";
    }

}
