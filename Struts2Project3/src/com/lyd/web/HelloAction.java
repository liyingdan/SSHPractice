package com.lyd.web;

import com.lyd.domain.Goods;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class HelloAction extends ActionSupport implements ModelDriven<Goods> {
    private Goods goods =new Goods();
    @Override
    public Goods getModel() {  return goods;
    }
    public String execute(){
        //获取值栈
        /*根区  非根区      根区：存放当前action相关数据都存放到根区
        * 非根区：是一些整个程序相关数据 相关域 req session application*/
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Goods goods = new Goods();
        goods.setName("111");
        goods.setPrice(20.2);
        //入栈(getRoot()可省略)
        //valueStack.getRoot().push(goods);
        valueStack.push(goods);
        //把栈顶的元素出栈
        //valueStack.getRoot().pop();
        //valueStack.pop();
        /*往域中写入一些数据*/
        //往req中
        ActionContext.getContext().put("reqName","reqValue");
        //往session
        ActionContext.getContext().getSession().put("sessionName","sessionValue");
        //往application域
        ActionContext.getContext().getApplication().put("ApplicationName","ApplicationValue");
        System.out.println(this.goods);
        return SUCCESS;

    }


}
