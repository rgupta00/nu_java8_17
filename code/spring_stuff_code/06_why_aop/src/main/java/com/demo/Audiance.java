package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audiance {
	//@Before, @After @AfterReturing @AfterThrows, @Around 
	
	@Around("execution(public void com.demo.*.*(..))")
	public void aroundDemo(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("start...");
		
		joinPoint.proceed();
		
		System.out.println("end---");
	}
	
//	
//	@AfterThrowing("execution(public void doMagic())")
//	public void callTheDr(Exception ex) {
//		System.out.println(ex.getMessage());
//		System.out.println("wow clapping...callTheDr");
//	}
	
	//only if method ex successfully
//	@AfterReturning("execution(public void doMagic())")
//	public void clappingAfterReturning() {
//		System.out.println("wow clapping...@AfterReturning");
//	}
	//in all case
	
//	@After("execution(public void doMagic())")
//	public void clappingAfter() {
//		System.out.println("wow clapping...after");
//	}
//	
//	@Before("execution(public void doMagic())")
//	public void clappingBefore() {
//		System.out.println("wow clapping..before.");
//	}


}
