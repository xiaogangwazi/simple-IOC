package com.example.demo2.IOC.exception;

/**
 * 自定义service命名不合法异常
 */
public class IllegalServiceName extends     RuntimeException {
    public IllegalServiceName(String message) {
        super(message);
    }
}
