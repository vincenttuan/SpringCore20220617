package com.spring.core.session02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session02.beans.Paper;
import com.spring.core.session02.beans.WhiteA4;

public class TesPaper {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Paper paper1 = ctx.getBean(Paper.class);
		//System.out.println(paper1);
		
		Paper paper2 = ctx.getBean("paper2", Paper.class);
		System.out.println(paper2);
		WhiteA4 paper3 = ctx.getBean("paper3", WhiteA4.class);
		System.out.println(paper3);
	}
}
