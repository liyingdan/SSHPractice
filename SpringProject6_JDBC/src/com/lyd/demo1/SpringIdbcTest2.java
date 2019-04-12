package com.lyd.demo1;

import com.lyd.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringIdbcTest2 {
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Test
    public void insert(){
        jdbcTemplate.update("insert into account value (null,?,?)","浦月月",5000d);
    }
    @Test
    public void delete(){
        jdbcTemplate.update("delete from account where id=?",1);
    }
    @Test
    public void update(){
        jdbcTemplate.update("update account set name=?,money=? where id=?","李小彤",550d,4);
    }
    @Test
    public void query(){
        String name = jdbcTemplate.queryForObject("select name from account where id=?",String.class,2);
        System.out.println(name);
    }
    @Test
    public void query2(){
        Long count = jdbcTemplate.queryForObject("select count(*) from account",Long.class);
        System.out.println(count);
    }
    @Test
    public void queryAccount(){
        Account account = jdbcTemplate.queryForObject("select * from account where id=?", new MyRowMap(), 2);
        System.out.println(account);

    }
    /*查询所有*/
    @Test
    public void queryAllAccount(){
        List<Account> query = jdbcTemplate.query("select * from account", new MyRowMap());
        //System.out.println(query);
        for (Account account : query){
            System.out.println(account);
        }
    }
    
}

class MyRowMap implements RowMapper<Account>{
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setMoney(resultSet.getDouble("money"));
        return account;
    }
}
