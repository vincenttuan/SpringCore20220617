package com.spring.core.session05.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 切面程式
@Component // 可以被 Spring 管理的物件
@Aspect // 切面
@Order(1) // 數字越小越先執行(若不設定預設就是int的最大值)
		  // 使用時機: 有多個切面程式在同一個程切關注點要執行時	
public class MyLoggerAspect {
	// 前置通知 Advice
	//@Before(value = "execution(public Integer com.spring.core.session05.aop.MathCalcImpl.add(Integer, Integer))") // 切入點表達式 Spring EL : execution(..)
	@Before(value = "execution(public Integer com.spring.core.session05.aop.MathCalcImpl.*(..))") // 切入點表達式 Spring EL : execution(..)
	public void beforeAdvice(JoinPoint joinPoint) { // joinPoint 連接點
		String methodName = joinPoint.getSignature().getName(); // 取得連接點的方法簽章名稱
		Object[] args = joinPoint.getArgs(); // 方法參數
		System.out.printf("前置通知 - 方法名稱: %s 方法參數: %s\n", methodName, args);
	}
}
