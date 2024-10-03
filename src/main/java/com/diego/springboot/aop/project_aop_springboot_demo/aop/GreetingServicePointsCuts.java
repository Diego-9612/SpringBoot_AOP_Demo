package com.diego.springboot.aop.project_aop_springboot_demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingServicePointsCuts {

    @Pointcut("execution(String com.diego.springboot.aop.project_aop_springboot_demo.services.GreetingService.*(..))")
    public void greetingLoggerFooPointCut() {
    }

    @Pointcut("execution(String com.diego.springboot.aop.project_aop_springboot_demo.services.GreetingService.*(..))")
    public void greetingLoggerPointCut(){}

}
