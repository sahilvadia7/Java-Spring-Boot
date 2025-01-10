package com.springaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class PerfomanceMonitoringAspect {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(PerfomanceMonitoringAspect.class);

    @Around("execution(* com.springaop.service.CarService.*(..))")
	public Object MoniterTime(ProceedingJoinPoint jp) throws Throwable {
		long startTime =  System.currentTimeMillis();
		Object obj = jp.proceed();
		long endTime =  System.currentTimeMillis();

		LOGGER.info("Time Taken : "+ jp.getSignature().getName()+" : " + (endTime - startTime));
		
		return obj;
	}
}
