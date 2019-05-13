package com.example.demo2.IOC.entity;

public class User {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public User(){
        this.name="张三";
    }

}
