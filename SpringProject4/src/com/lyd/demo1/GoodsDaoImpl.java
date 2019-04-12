package com.lyd.demo1;

public class GoodsDaoImpl implements GoodsDao {
    @Override
    public void save() {
        System.out.println("保存操作");
    }

    @Override
    public String update() {
        System.out.println("更新操作");
        return "我是返回值";
    }

    @Override
    public void delete() {
        System.out.println("删除操作");
    }

    @Override
    public void find() {
        System.out.println("find方法呀");
//        int a = 1/0;
    }

}
