package com.diego.springboot.aop.project_aop_springboot_demo.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class GreetingAopFoo {

    private Logger logger = LoggerFactory.getLogger(GreetingAop.class);

    @Before("GreetingServicePointsCuts.greetingLoggerFooPointCut()")
    public void loggerBefore(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Antes:" + method + "Invocado con los argumentos " + args);

    }

}
