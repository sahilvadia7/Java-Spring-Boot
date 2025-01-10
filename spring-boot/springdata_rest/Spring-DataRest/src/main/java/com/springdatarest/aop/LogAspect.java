package com.springdatarest.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LogAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);
	
//	return type, class name, argument
//	void,package com.springdatarest.student,method()

//	return type ,class name, method name , argument
	@Before("execution(* com.springdatarest.service.studentService.*(..)")
	public void logMethodCall() {
		LOGGER.info("Method call"); 
	}
}
