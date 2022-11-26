package com.java9features;
import  java.util.*;
public class DemoImmutable {
    public static void main(String[] args) {
        int arr[]={4,5,7};
        List<String> data=new ArrayList<>();
        data.add("foo");

        MyImmutableClass myImmutableClass=new MyImmutableClass(data, arr);
        System.out.println(myImmutableClass);

        arr[1]=555;
        data.add("bar");
        System.out.println(myImmutableClass);
    }
}
