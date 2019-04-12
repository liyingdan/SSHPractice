package com.lyd.service;

import com.lyd.dao.AccountDao;
import com.lyd.domain.Account;

public class AccountServiceImpl implements AccountService {
    /*注入dao*/
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        /*System.out.println("已经来到业务类"+account);*/
        //调用dao保存到数据库当中
        accountDao.save(account);
        System.out.println("服务层执行了");
    }

}
