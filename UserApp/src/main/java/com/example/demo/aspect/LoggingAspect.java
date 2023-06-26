package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.example.demo.service..*(..) )")
	public void logAfterMethods(JoinPoint jp) {
		log.info(jp.getSignature().getName() );
	}

}
