package com.lyd.demo2;

public class Person {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }


}
