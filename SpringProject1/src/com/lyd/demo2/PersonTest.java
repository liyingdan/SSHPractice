package com.lyd.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    @Test
    public void test(){
        //加载核心配置文件  会帮你创建对象  所有的对象
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) applicationContext.getBean("person");
        Person person1 = (Person) applicationContext.getBean("person");
        System.out.println(person);
        System.out.println(person1);

        //使用单例（singleton）：关闭工厂(所有的对象都销毁)
        applicationContext.close();


    }

}
