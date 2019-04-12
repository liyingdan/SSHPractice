package com.lyd.Text;

import com.lyd.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateText {
    @Test
    public void text1(){
        //1.加载配置文件
        Configuration configure = new Configuration().configure();
        //2.创建sessionFactory ------JDBC连接池
        SessionFactory sessionFactory = configure.buildSessionFactory();
        //3.获取session     ----连接对象
        Session session = sessionFactory.openSession();

        Customer customer = new Customer();
        customer.setCust_name("Janet");
        customer.setCust_level("2");

        //4.保存
        session.save(customer);

        //5.释放资源
        session.close();
        sessionFactory.close();

    }




}
