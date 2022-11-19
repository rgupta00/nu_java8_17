package com.demo.reflection;

import java.lang.reflect.Constructor;

class MySingleton{
    private static MySingleton mySingleton=new MySingleton();
    private MySingleton(){
        System.out.println("dare to call me");
    }
    public static MySingleton getMySingleton(){
        return mySingleton;
    }
}
public class CallPrivateCtr {

    public static void main(String[] args) throws Exception{
        MySingleton mySingleton=MySingleton.getMySingleton();
        System.out.println(mySingleton.hashCode());

        Class clazz=Class.forName("com.demo.reflection.MySingleton");
        Constructor constructor[]=clazz.getDeclaredConstructors();
        constructor[0].setAccessible(true);//hey ever if it is private i wanna to call
        MySingleton mySingleton1=(MySingleton) constructor[0].newInstance();
        System.out.println(mySingleton1.hashCode());

    }
}
