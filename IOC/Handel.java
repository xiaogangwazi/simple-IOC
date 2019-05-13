package com.example.demo2.IOC;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Handel {

    @Pointcut("execution(* com.example.demo2.IOC.service.ServiceImpl.*.*(..))")
    public void pintcut(){}

    @Around(value = "pintcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint ) throws Throwable {

        System.out.println("开始之前");
        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("开始之后");

    }
}
