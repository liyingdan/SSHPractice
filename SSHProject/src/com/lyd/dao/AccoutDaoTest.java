package com.lyd.dao;

import com.lyd.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccoutDaoTest {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Test
    public void test(){
        Account account = accountDao.getById(8);
        System.out.println(account);
        /*account.setMoney(100d);
        accountDao.update(account);*/
        accountDao.delete(account);
    }

    @Test
    public void test2(){
        List<Account> allAccount = accountDao.getAllAccount();
        for(Account account : allAccount){
            System.out.println(account);
        }
    }
}
