package com.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        UserLoginImpl user = new UserLoginImpl(); // �õ�ʵ������
        MyHandler handler = new MyHandler(user); // ���������Լ��Ĵ�������

        UserLogin proxy = (UserLogin) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass()
                .getInterfaces(), handler); // �õ��������

        proxy.login("����"); // �������login����
    }
}
