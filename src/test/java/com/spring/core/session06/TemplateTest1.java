package com.spring.core.session06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session06.template.EmpDao;

public class TemplateTest1 {
	@Test
	public void test() {
		// 使用 xml 配置
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		// 使用 java 配置
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);
		
		EmpDao empDao = ctx.getBean("empDao", EmpDao.class);
		System.out.println(empDao.queryAll());
	}
}
