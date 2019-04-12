package com.lyd.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class GoodsTest {
    @Autowired
    @Qualifier("goodsDao")
    private GoodsDao goodsDao;

    @Test
    public void test(){
        goodsDao.save();
        goodsDao.update();
        //goodsDao.delete();
        //goodsDao.find();
    }
}
