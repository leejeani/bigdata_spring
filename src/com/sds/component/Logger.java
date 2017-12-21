package com.sds.component;

import java.util.Date;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
	// before
	public void logging(JoinPoint jp) {
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
	}
	// after
	public void logger(JoinPoint jp,Object obj) {
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println("RESULT:"+obj.toString());
	}
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





