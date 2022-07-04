package com.spring.core.session05.aop_lab;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect // 觀眾: 切面程式
public class Audience {
	@Pointcut(value = "execution(* com.spring.core.session05.aop_lab.Performance.perform(..))")
	public void pt() {}
	
	public void slienceCellPhone() {
		System.out.println("觀眾-關閉手機");
	}
	
	public void takeSeats() {
		System.out.println("觀眾-找到座位");
	}
	
	public void applause() {
		System.out.println("觀眾-拍手鼓掌");
	}
	
	public void exit() {
		System.out.println("觀眾-離開表演會場");
	}
	
	public void demanRefund() {
		System.out.println("觀眾-退票 ! 退票 ! 並離場");
	}
	
}
