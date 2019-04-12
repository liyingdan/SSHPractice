package com.lyd.struts2;


import com.opensymphony.xwork2.Action;

public class HelloAction2 implements Action {

    @Override
    public String execute() throws Exception {
        System.out.println("hello struts2....");
        return SUCCESS;
    }
}
