package com.lyd.demo4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Students {
    public  String name;
    public Integer age;
    public Dog dog;
    public String dogName;

   public Students(String name,Integer age){
       this.name = name;
       this.age = age;
   }
    public void setDog(Dog dog) {
        this.dog = dog;
    }
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    /*数组*/
    public String arr[];
    public void setArr(String[] arr) {
        this.arr = arr;
    }

    //list集合
    public List myList;
    public void setMyList(List myList) {
        this.myList = myList;
    }

    //set集合
    public Set mySet;
    public void setMySet(Set mySet) {
        this.mySet = mySet;
    }

    //map集合
    public Map myMap;
    public void setMyMap(Map myMap) {
        this.myMap = myMap;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", dogName='" + dogName + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
