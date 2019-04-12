package com.lyd.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog {
    @Value("旺财")
    public String name;
}
