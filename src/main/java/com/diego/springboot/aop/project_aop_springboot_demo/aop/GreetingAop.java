package com.diego.springboot.aop.project_aop_springboot_demo.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAop {

    private Logger logger = LoggerFactory.getLogger(GreetingAop.class);

    @Before("execution(String com.diego.springboot.aop.project_aop_springboot_demo.services.GreetingService.sayHello(..))")
    public void loggerBefore(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Antes:" + method + "con los argumentos "+ args);

    }

    @After("execution(String com.diego.springboot.aop.project_aop_springboot_demo.services.GreetingService.sayHello(..))")
    public void loggerAfter(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("despues:" + method + "con los argumentos "+ args);

    }

    @AfterReturning("execution(String com.diego.springboot.aop.project_aop_springboot_demo.services.GreetingService.sayHello(..))")
    public void loggerReturing(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("despues de retornar:" + method + "con los argumentos "+ args);

    }

    @AfterThrowing("execution(String com.diego.springboot.aop.project_aop_springboot_demo.services.GreetingService.sayHelloError(..))")
    public void loggerThrowing(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("despues lanzar una excepcion:" + method + "con los argumentos "+ args);

    }

}
