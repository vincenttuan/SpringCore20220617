package com.spring.core.session02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session02.beans.Paper;

public class TesPaper {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Paper paper1 = ctx.getBean(Paper.class);
		System.out.println(paper1);
	}
}
