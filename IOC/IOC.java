package com.example.demo2.IOC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * IOC容器
 */
public class IOC {
            private static  final Logger logger = LoggerFactory.getLogger(IOC.class);
    private static   IOC ioc =null;
    private  Map<String,Object>  MYIOC=new HashMap<>();

    public void register(String name,Object o){
        MYIOC.put(name,o);
    }
    private IOC(){}


   public   static  IOC newInstance(){


       if(ioc==null){
           synchronized (IOC.class){
               if(ioc==null){
                   ioc=new IOC();
               }
           }
       }
       System.out.println("创建IOC容器成功！");
       return ioc;

   }


   public Object get(String name){
        return MYIOC.get(name);
   }


}
