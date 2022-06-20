package com.spring.core.session02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session02.beans.Author;
import com.spring.core.session02.beans.Lotto;

public class TestAuthor {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Author author1 = ctx.getBean("author1", Author.class);
		System.out.println(author1);
		author1.setName("Vincent");
		author1.setSex('M');
		author1.setAge(30);
		System.out.println(author1);
	}
}
