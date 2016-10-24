package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    private Object obj;

    public MyHandler(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeLogin(); // ��¼ǰ���������Լ���Ҫ��д

        Object result = method.invoke(obj, args); // ���������ķ���

        afterLogin(); // ��¼���������Լ���Ҫ��д

        return result;
    }

    public void beforeLogin() {
        System.out.println("��¼ǰ����");
    }

    public void afterLogin() {
        System.out.println("��¼����");
    }
}
