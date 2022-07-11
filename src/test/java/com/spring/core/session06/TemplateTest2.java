package com.spring.core.session06;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session06.entity.Emp;
import com.spring.core.session06.template.EmpDao;

public class TemplateTest2 {
	@Test
	public void test() {
		// 使用 xml 配置
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		EmpDao empDao = ctx.getBean("empDao", EmpDao.class);
		// 測試單筆新增 I
		//int rowcount = empDao.addOne1("test1", 18);
		//System.out.println(rowcount);
		// 測試單筆新增 II
		int rowcount = empDao.addOne2("test2", 19);
		System.out.println(rowcount);
		
	}
}
