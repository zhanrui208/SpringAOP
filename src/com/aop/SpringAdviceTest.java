package com.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAdviceTest {
	@Test
	public void testAdvice(){
		String configPath = "com/aop/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		UserLogin use = (UserLoginImpl) ctx.getBean("UserLoginImpl");
		use.login("jerry");
	}
}
