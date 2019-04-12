package com.lyd.service;

import com.lyd.dao.UserDao;
import com.lyd.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired/*根据类型自动注入*/
    private UserDao userDao;

    @Override
    public void delete() {
        userDao.delete();
    }
}
