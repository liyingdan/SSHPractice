package com.lyd.Test;

import com.lyd.domain.Customer;
import com.lyd.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

public class HibernateTest2 {
    @Test
    public void test(){
        /*简单查询HQL
        * HQL当中不支持*的写法
        * createQuery("from 类名")*/
        Session session =  HibernateUtil.openSession();
       //Query query = session.createQuery("from Customer ");

        //别名查询
        //Query query = session.createQuery("select c from Customer c");//（查询结果一样）

        //排序查询
        //desc代表降序
        Query query = session.createQuery("select c from Customer c order by cust_id desc ");
        List<Customer> list = query.list();
        System.out.println(list);


    }

    @Test
    public void test2(){
        //条件查询
        Session session =  HibernateUtil.openSession();
        session.createQuery("");



    }

}
