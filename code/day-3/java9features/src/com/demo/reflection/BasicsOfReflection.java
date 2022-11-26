package com.demo.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BasicsOfReflection {
    public static void main(String[] args) {

        try{
            Class<?> clazz=Class.forName("com.pojo.Book");
            System.out.println("class is loaded");
            Method[]methods=clazz.getMethods();
            for(Method method: methods){

                System.out.println(method.getName()+": "+ method.getReturnType()+": "+ Modifier.toString(method.getModifiers()));
            }
        }catch (ClassNotFoundException e){
            System.out.println("class is not found");
        }

    }
}
