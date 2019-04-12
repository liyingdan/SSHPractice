package com.lyd.test;

import com.lyd.service.UserService;
import com.lyd.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test(){
       /* UserService userService = new UserServiceImpl();
        userService.delete();*/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.delete();

    }
}
