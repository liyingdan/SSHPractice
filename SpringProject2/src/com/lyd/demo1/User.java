package com.lyd.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("user")
public class User {
    @Value("李应丹")
    public String name;
    @Autowired
    @Qualifier("dog")
    /*@Resource(name = "dog")*/
    public Dog dog;

   /* @PostConstruct
    public void init(){
        System.out.println("init-----初始化");
    }*/




}
