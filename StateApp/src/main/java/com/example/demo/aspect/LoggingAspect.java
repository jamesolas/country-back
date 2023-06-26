package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
//	@Pointcut("within(com.example.demo)")
//	public void pointCut() {
//	}
	
//	@AfterReturning(pointcut="execution(* com.example.demo.service..*(..))",returning="value")
	@AfterReturning(pointcut="execution(* com.example.demo..*(..))",returning="value")
	public void logAfterMethods(JoinPoint jp, Object value) {
		log.info(jp.getSignature().getName()+" "+value.toString());
	}
	
	
}
