package com.proxyscheml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String arg[]){
		String configPah = "com/proxyscheml/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPah);
		Waiter waiter = (Waiter) ctx.getBean("waiter");
		Seller seller = (Seller) ctx.getBean("seller");
		
		waiter.greetTo("jone");
		seller.greeTo("jerry");
		
	}	
}
