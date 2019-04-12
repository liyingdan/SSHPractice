package com.lyd.demo2;

import com.lyd.demo1.GoodsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
    @Autowired
    @Qualifier("goodsDao")
    private GoodsDao goodsDao;

    @Test
    public void tesy() {
        /* this.goodsDao.save();*/
        /*this.goodsDao.update();*/
        /*this.goodsDao.delete();*/
        this.goodsDao.find();
    }
}
