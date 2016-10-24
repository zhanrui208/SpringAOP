package com.aop;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class BeforeAdviceTest {
    public static void main(String[] args) {
        UserLogin target = new UserLoginImpl(); // ����ĵ�¼�û�
        BeforeAdvice advice = new BeforeAdvice(); // ǰ��֪ͨ
        ProxyFactory proxyFactory = new ProxyFactory(); // Spring��������
        proxyFactory.setTarget(target); // ���ô���Ŀ��
        proxyFactory.addAdvice(advice); // Ϊ����Ŀ������ǰ��֪ͨ
        UserLogin proxy = (UserLogin) proxyFactory.getProxy(); // ���ɴ���ʵ��
        proxy.login("����"); // ���õ�¼����
    }
}