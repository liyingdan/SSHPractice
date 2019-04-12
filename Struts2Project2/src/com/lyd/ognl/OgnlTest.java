package com.lyd.ognl;


import com.lyd.domain.Goods;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

public class OgnlTest {
    @Test
    public void test(){
        //ongl使用
        OgnlContext ognlContext = new OgnlContext();
        //存数据 根对象
        ognlContext.setRoot("你好呀 李丹丹");
        //取数据
        Object obj = Ognl.getRoot(ognlContext);
        System.out.println(obj);

    }

    //1.根对象中存取数据
    @Test
    public void test2() throws OgnlException {
        //ongl使用
        OgnlContext ognlContext = new OgnlContext();
        //存数据 根对象
        Goods goods = new Goods();
        goods.setName("小裙子");
        goods.setPrice(555.0);
        ognlContext.setRoot(goods);

        //获取root
        Object root = ognlContext.getRoot();

        /*1.表达式：取哪一个字段
        * 2.ognlContext
        * 3.root*/
        Object obj = Ognl.getValue("name", ognlContext, root);
        System.out.println(obj);

    }

    //2.非根对象中存取数据
    @Test
    public void test3() throws OgnlException {
        //ongl使用
        OgnlContext ognlContext = new OgnlContext();
        //存数据 根对象
        Goods goods = new Goods();
        goods.setName("小裙子呀");
        goods.setPrice(55.0);
        //非根对象 (非根对象不能取某一个字段 取的时候 取的就是存的内容)
        ognlContext.put("goods",goods);

        //获取root
        Object root = ognlContext.getRoot();

        /*1.表达式 #key
         * 2.ognlContext
         * 3.root*/
        Goods obj = (Goods)Ognl.getValue("#goods", ognlContext, root);
        //System.out.println(obj.getName());
        System.out.println(obj);
    }

    //调用对象的方法
    @Test
    public void test4() throws OgnlException {
        /*ongl使用*/
        //获取context
        OgnlContext ognlContext = new OgnlContext();
        //获取根对象
        Object root = ognlContext.getRoot();

        //调用对象的普通方法
        //执行表达式
        Object value = Ognl.getValue("'hello'.length()", ognlContext, root);
        System.out.println(value);

        //调用静态方法
        //执行表达式 获取对象静态方式@类型@方法名
        Object value2 = Ognl.getValue("@java.lang.Math@random()", ognlContext, root);
        System.out.println(value2);
    }
}
