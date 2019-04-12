package com.lyd.demo3;

public class User {
    /*public User() {
        super();
        System.out.println("默认构造方法");
    }*/

    public static User createUser(){
        System.out.println("调用了createUser");
        return new User();
    }

}
