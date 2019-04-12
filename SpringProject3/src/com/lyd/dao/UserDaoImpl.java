package com.lyd.dao;


import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void delete() {
        System.out.println("从数据库中删除哈哈哈哈");
    }
}
