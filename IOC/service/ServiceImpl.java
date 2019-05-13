package com.example.demo2.IOC.service;

import com.example.demo2.IOC.entity.User;
import com.example.demo2.IOC.annotation.MyAutowired;
import com.example.demo2.IOC.annotation.MyService;

@MyService("service")
public class ServiceImpl   implements Service {
    @MyAutowired
    private User user;
    @Override
    public void say() {
        System.out.println("你好"+user.getName());

    }
}
