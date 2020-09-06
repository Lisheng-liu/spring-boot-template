package com.lls.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.sql.ResultSet;

@Aspect
@Order(2)
@Component
@Slf4j
public class LogAspect {

    private HttpServletRequest request;

    @Pointcut("within(com.lls.controller.*)")
    public void pointCut(){

    }


    @Around("pointCut()")
    public ResultSet logAspect(ProceedingJoinPoint proceedingJoinPoint){
        ResultSet resultSet = null;
        try {
            resultSet = (ResultSet) proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        if(resultSet != null){
            saveLog(proceedingJoinPoint,resultSet,request);
        }
        return resultSet;
    }

    private void saveLog(ProceedingJoinPoint proceedingJoinPoint, ResultSet resultSet, HttpServletRequest request) {
        Signature signature = proceedingJoinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        Log log = method.getAnnotation(Log.class);
        if(log != null){
            String methodName = proceedingJoinPoint.getClass().getName()+"#"+proceedingJoinPoint.getSignature().getName();
            String title = log.title();
            int businessType = log.buinessType().ordinal();

            //TODO insert db log
            System.out.println("methodName:"+methodName);
            System.out.println("title:"+title);
        }

    }


}
