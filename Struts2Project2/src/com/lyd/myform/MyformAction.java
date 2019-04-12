package com.lyd.myform;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.HttpParameters;

import java.util.Arrays;

public class MyformAction extends ActionSupport {
    public String execute(){
        //接收表单当中的参数
        ActionContext context = ActionContext.getContext();
        HttpParameters parameters = context.getParameters();
        //获取参数
        String username = parameters.get("username").getValue();
        System.out.println(username);

        String nick = parameters.get("nick").getValue();
        System.out.println(nick);
        //获取多个参数
        String[] hobbies = parameters.get("hobby").getMultipleValues();
        System.out.println(Arrays.toString(hobbies));

        //往request域中存数据
        context.put("reqName","reqValue");
        //往session中...
        context.getSession().put("sessionName","sessionValue");
        //application中...
        context.getApplication().put("ApplicationName","ApplicationValue");

        return SUCCESS;
    }
}
