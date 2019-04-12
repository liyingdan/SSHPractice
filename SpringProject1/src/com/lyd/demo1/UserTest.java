package com.lyd.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test(){
        //1.加载配置文件
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

       //2.根据id获取对象
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        userDao.save();
        userDao.delete();

    }

    @Test
    public void test2(){
        /*UserDaoOracleImpl userDaoOracle = new UserDaoOracleImpl();
        userDaoOracle.name = "lkkk";
        System.out.println(userDaoOracle.name);*/
        //依赖注入：给spring管理类当中依赖的属性，通过配置文件进行赋值的过程
        //1.加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoOracleImpl obj = (UserDaoOracleImpl)applicationContext.getBean("userDao");
        System.out.println(obj.name);
    }
}
