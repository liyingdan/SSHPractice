package com.lyd.demo3;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void teansferMoney(String from, String to, Double money) {
        this.accountDao.minusMoney(from,money);
//        int a = 1/0;
        this.accountDao.addMoney(to,money);


    }
}
