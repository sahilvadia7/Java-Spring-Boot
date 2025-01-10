package com.springaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    // Log all method calls in all classes(return type, fully-class-name.method(arguments))
    @Before("execution(* com.springaop.service.CarService.*(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method call : "+jp.getSignature().getName());
    }
}
