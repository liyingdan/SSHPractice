package com.lyd.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentTest {
    @Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Students student = (Students) applicationContext.getBean("student");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.dog.name);
        System.out.println(student.dog.color);
        System.out.println(student.dogName);
        //数组不能直接打印，这样打印出来的是地址(list集合可以直接打印)
//        System.out.println(student.arr);
        System.out.println(Arrays.toString(student.arr));
        System.out.println(student.myList);
        System.out.println(student.mySet);
        System.out.println(student.myMap);

    }
}
