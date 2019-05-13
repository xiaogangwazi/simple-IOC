package com.example.demo2.IOC.annotation;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyService {
    boolean required() default  true;
    String value() default "";
}
