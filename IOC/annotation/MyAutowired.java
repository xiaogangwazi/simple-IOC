package com.example.demo2.IOC.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAutowired {
    boolean required() default  true;
}
