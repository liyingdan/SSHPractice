package com.lyd.web;

import com.lyd.domain.Account;
import com.lyd.service.AccountService;
import com.lyd.service.AccountServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

public class AccountAction extends ActionSupport implements ModelDriven<Account> {
    private Account account = new Account();
    @Override
    public Account getModel() {
        return account;
    }

    //自动注入
    AccountService accountService;
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public String save(){
        /*调用业务层*/
       /* AccountServiceImpl accountService = new AccountServiceImpl();
        accountService.save(account);*/

       /* *//*使用spring调用业务层*//*
        ServletContext servletContext = ServletActionContext.getServletContext();
        *//*获取工厂*//*
        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        *//*获取对象*//*
        AccountService accountService = (AccountService)applicationContext.getBean("accountService");
        accountService.save(account);*/

        accountService.save(account);

        return null;
    }


}
