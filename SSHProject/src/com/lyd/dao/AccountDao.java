package com.lyd.dao;

import com.lyd.domain.Account;

import java.util.List;

public interface AccountDao {
    public void save(Account account);
    public void update(Account account);
    public void delete(Account account);
    public Account getById(Integer id);
    public List<Account> getAllAccount();
}
