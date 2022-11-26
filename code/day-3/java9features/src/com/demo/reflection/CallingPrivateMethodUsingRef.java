package com.demo.reflection;

import java.lang.reflect.Method;

class CallMe{
    public String welcome(String name){
        return "welome champs: " + name;
    }
}
public class CallingPrivateMethodUsingRef {
    public static void main(String[] args) throws Exception{
        Class<?>clazz=Class.forName("com.demo.reflection.CallMe");

        Method method= clazz.getMethod("welcome",String.class);
        Object callMe=clazz.newInstance();

        String data= (String) method.invoke(callMe,"amit");

        System.out.println(data);
    }
}
