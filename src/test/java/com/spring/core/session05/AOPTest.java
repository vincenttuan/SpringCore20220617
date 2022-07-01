package com.spring.core.session05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session05.aop.MathCalc;

public class AOPTest {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
		MathCalc calc = ctx.getBean(MathCalc.class);
		System.out.println(calc.add(20, 10));
	}
}
