package com.springaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.springaop.service.CarService.*(..)) && args(postId)" )
    public Object validateAndUpdate(ProceedingJoinPoint jp, Long postId ) throws Throwable {
		LOGGER.info("Old Value : "+postId);

    	if(postId < 0) {
    		postId = -postId;
    		LOGGER.info("New Value : "+postId);
    	}
    	
    	Object obj = jp.proceed(new Object[] {postId});
    	return obj;
    }
}
