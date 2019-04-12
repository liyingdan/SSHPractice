package com.lyd.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class GoodsAspect {
    @Before(value = "GoodsAspect.pointcut1()")
    public void before(){
        System.out.println("前置通知");
    }

    @AfterReturning(value = "execution(* com.lyd.demo1.GoodsDaoImpl.update(..))",returning = "result")
    public void after( Object result){
        System.out.println("后置通知"+result);
    }

    @Around(value = "execution(* com.lyd.demo1.GoodsDaoImpl.delete(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前=====");
        Object obj = joinPoint.proceed();
        System.out.println("后-----");
        return obj;
    }

    @AfterThrowing(value = "execution(* com.lyd.demo1.GoodsDaoImpl.find(..))",throwing = "ex")
    public void afterThrowing(Throwable ex){
        System.out.println("异常抛出---"+ex);
    }

    @After(value = "execution(* com.lyd.demo1.GoodsDaoImpl.find(..))")
    public void after(){
        System.out.println("最终通知");

    }

    @Pointcut(value = "execution(* com.lyd.demo1.GoodsDaoImpl.save(..)) || execution(* com.lyd.demo1.GoodsDaoImpl.update(..))")
    public void pointcut1(){} //写一个空的方法

}
