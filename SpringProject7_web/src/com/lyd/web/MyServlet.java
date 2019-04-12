package com.lyd.web;

import com.lyd.service.UserService;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("MyServlet");
        ServletContext servletContext = this.getServletContext();
        /*获取工厂 程序自动启动的时候 保存到serServletContext*/
        WebApplicationContext applicationContext =
                WebApplicationContextUtils.getWebApplicationContext(servletContext);
        /*获取对象*/
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.save();

    }

}
