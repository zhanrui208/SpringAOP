package com.proxy;

import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;


public class CheckUser implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("���õķ�����Ϊ��" + method.getName());
	}

}
