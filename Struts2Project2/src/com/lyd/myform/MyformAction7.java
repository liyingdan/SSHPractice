package com.lyd.myform;

import com.lyd.domain.Goods;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

//Map集合接收参数
public class MyformAction7 extends ActionSupport  {
    private Map<String,Goods> goodsMap;

    public Map<String, Goods> getGoodsMap() {
        return goodsMap;
    }
    public void setGoodsMap(Map<String, Goods> goodsMap) {
        this.goodsMap = goodsMap;
    }

    public String execute(){
        System.out.println(goodsMap);
        return null;

    }


}
