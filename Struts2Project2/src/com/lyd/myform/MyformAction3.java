package com.lyd.myform;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

public class MyformAction3 extends ActionSupport {
    private String username;
    private Integer age;
    private List hobby;

    //提供属性的方法
    public void setUsername(String username) {
        this.username = username;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public String execute(){
        System.out.println(username);
        System.out.println(age);
        System.out.println(hobby);

        return null;

    }
}