package com.sds.component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class Logger {
	// before
	//@Before("execution(* com.sds.component..*Service.*(..))")
	public void logging(JoinPoint jp) {
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
	}
	// after
//	@AfterReturning(
//		pointcut="execution(* com.sds.component..*Service.*(..))"	
//		,returning="obj"
//	)
	public void logger(JoinPoint jp,Object obj) {
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println("RESULT:"+obj.toString());
	}
	@Around("execution(* com.sds.component..*Service.*(..))")
	public Object aroundLogger(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("함수 실행 전");
		System.out.println(pjp.getSignature().getName());
		System.out.println(pjp.getArgs()[0].toString());
		Object returnObj = pjp.proceed();
		System.out.println(returnObj.toString());
		System.out.println("함수 실행 후");
		return returnObj;
	}
}





