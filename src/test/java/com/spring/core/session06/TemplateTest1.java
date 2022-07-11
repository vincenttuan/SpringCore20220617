package com.spring.core.session06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session06.template.EmpDao;

public class TemplateTest1 {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		
		EmpDao empDao = ctx.getBean("empDao", EmpDao.class);
		System.out.println(empDao.queryAll());
	}
}
