package com.example.demo2.IOC.exception;

import jdk.nashorn.internal.runtime.regexp.joni.Warnings;

/**
 * 自定义service没有命名异常
 */
public class ServiceMustNamed extends  RuntimeException {
    public ServiceMustNamed(String message) {
        super(message);
    }
}
