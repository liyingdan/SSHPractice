package com.lyd.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class AccountTest {
    @Autowired
    @Qualifier("accountService")
    private AccountService accountService;
    @Test
    public void tset(){
        accountService.teansferMoney("毛园","李自瑶",1000d);

    }
}
