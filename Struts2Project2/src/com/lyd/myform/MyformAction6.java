package com.lyd.myform;

import com.lyd.domain.Goods;
import com.lyd.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

//List集合接收参数
public class MyformAction6 extends ActionSupport  {
    private List<Goods> goodslist;

    public List<Goods> getGoodslist() {
        return goodslist;
    }
    public void setGoodslist(List<Goods> goodslist) {
        this.goodslist = goodslist;
    }

    public String execute(){
        System.out.println(goodslist);
        return null;

    }


}
