package com.lyd.Test;

import com.lyd.domain.Customer;
import com.lyd.domain.Linkman;
import com.lyd.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class HibernateTest {
    @Test
    public void test(){
        Session currentSession =  HibernateUtil.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        Customer customer1 = new Customer();  customer1.setCust_name("customer1");
        Customer customer2 = new Customer();   customer2.setCust_name("customer2");
        Customer customer3 = new Customer();   customer3.setCust_name("customer3");
        Linkman linkman1 = new Linkman();     linkman1.setLink_name("linkman1");
        Linkman linkman2 = new Linkman();     linkman2.setLink_name("linkman2");
        Linkman linkman3 = new Linkman();     linkman3.setLink_name("linkman3");
        /*配置关系 双向维护  单向维护（一般不用）*/
        customer1.getLinkmens().add(linkman1);    customer1.getLinkmens().add(linkman2);
        customer2.getLinkmens().add(linkman3);
        linkman1.setCustomer(customer1);     linkman2.setCustomer(customer1);
        linkman3.setCustomer(customer2);
        currentSession.save(customer1);     currentSession.save(customer2);
        currentSession.save(customer3);
        /*没有级联之前：只保存一边
        * 瞬时对象异常
        * 持久态对象关联一个瞬时对象
        * */
        currentSession.save(linkman1);
        currentSession.save(linkman2);
        currentSession.save(linkman3);
        transaction.commit();

    }
    @Test
    public void test2(){
        Session currentSession = HibernateUtil.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        Linkman linkman = currentSession.get(Linkman.class,1L);
        transaction.commit();
        System.out.println(linkman);
    }

    @Test
    /*级联删除 删除一条数据时，把它关联的数据一起删掉*/
    public void test3(){
        Session currentSession = HibernateUtil.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
       /*删除 默认
       * 打断两个表之间的关系 link_cust_id = null
       * 再去删除记录，并没有级联去删除操作
       * 想要级联操作 必须配置
       * */
        Customer customer = currentSession.get(Customer.class,2L);
        currentSession.delete(customer);
        transaction.commit();
    }

    @Test
    public void test4(){
        Session currentSession = HibernateUtil.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
       //更新
        Linkman linkman1 = currentSession.get(Linkman.class, 1L);
        Customer customer2 = currentSession.get(Customer.class, 2L);
        //关联
        //单向维护
        //双向维护  让一方放弃维护权（在谁的里面添加就让谁放弃维护：在customer配置）
        //inverse="true"：放弃维护权
        customer2.getLinkmens().add(linkman1);
        linkman1.setCustomer(customer2);
        transaction.commit();
    }


}
