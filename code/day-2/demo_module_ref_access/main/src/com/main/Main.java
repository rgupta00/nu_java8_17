package com.main;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args)throws Exception {
       Class<?> clazz=Class.forName("com.hello.HelloWorld");
        Constructor constructors[]=clazz.getDeclaredConstructors();
        Object object=constructors[0].newInstance();
        System.out.println(object);
    }
}