package com.proxyscheml;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.support.ClassFilters;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {

	@Override
	public boolean matches(Method method, Class clazz) {
		// TODO Auto-generated method stub
		return "greetTo".equals(method.getName());
	}

	public ClassFilters getClassFilters(){
		//�е���ƥ�����ΪWaiter�˵��������
		return new ClassFilters(){
			public boolean matches(Class clazz){
				return Waiter.class.isAssignableFrom(clazz);
			}
		};
	}
}
