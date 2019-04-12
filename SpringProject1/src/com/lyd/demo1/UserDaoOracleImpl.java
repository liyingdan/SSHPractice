package com.lyd.demo1;

public class UserDaoOracleImpl implements UserDao {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("oracle-save");
    }

    @Override
    public void delete() {
        System.out.println("oracle-save");
    }
}
