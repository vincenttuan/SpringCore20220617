package com.spring.core.session03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session03.beans.Clazz;
import com.spring.core.session03.beans.Teacher;

public class TestTeacher {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher teacher1 = ctx.getBean("teacher1", Teacher.class);
		System.out.println(teacher1);
	}
}
