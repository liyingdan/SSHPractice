package com.lyd.myform;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.HttpParameters;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

public class MyformAction2 extends ActionSupport {
    public String execute(){
        //获取原生api
        HttpServletRequest request = ServletActionContext.getRequest();

        //获取参数
        String username = request.getParameter("username");
        String nick = request.getParameter("nick");
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(username);
        System.out.println(nick);
        System.out.println(Arrays.toString(hobbies));

        //往域中存数据
        request.setAttribute("name","value");
        request.getSession().setAttribute("name","value");
        ServletActionContext.getServletContext().setAttribute("name","Value");

        return null;

    }
}
