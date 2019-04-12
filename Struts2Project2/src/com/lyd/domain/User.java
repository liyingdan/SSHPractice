package com.lyd.domain;

import java.util.List;

public class User {
    private String username;
    private Integer age;
    private List hobby;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public List getHobby() {
        return hobby;
    }
    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", hobby=" + hobby +
                '}';
    }
}