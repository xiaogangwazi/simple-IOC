package com.example.demo2.IOC;

import com.example.demo2.IOC.annotation.MyAutowired;
import com.example.demo2.IOC.annotation.MyController;
import com.example.demo2.IOC.annotation.MyService;
import com.example.demo2.IOC.service.Service;
import com.example.demo2.IOC.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * 启动类
 * 创建IOC容器
 * 扫描包注册bean
 */
@MyController
public class start {
    @MyAutowired
    private static Service service;
    public static void main(String[] args) throws InterruptedException {
        IOC ioc =IOC.newInstance();
        HQScanPackage.newInstancec(start.class.getPackage().getName(),ioc);
        service.say();
    }

}
