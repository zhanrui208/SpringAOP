package com.aop;

public class UserLoginImpl implements UserLogin {

    public void login(String userName) {
        System.out.println(userName + " 正在登录系统");
    }
}