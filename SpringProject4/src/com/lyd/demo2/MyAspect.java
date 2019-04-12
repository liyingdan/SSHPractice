package com.lyd.demo2;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    /*前置通知*/
    public void check(){
        System.out.println("权限校验");
    }
    /*后置通知*/
    public void log(Object res ){
        System.out.println("我是日志"+res);
    }
    /*环绕通知*/
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("开启事务");
        Object proceed = joinPoint.proceed();
        System.out.println("提交事务");
        return proceed;
    }
    /*异常通知*/
    public void exceptionM(){
        System.out.println("发生异常了");
    }
    /*最终通知*/
    public void after(){
        System.out.println("after----");
    }
}
