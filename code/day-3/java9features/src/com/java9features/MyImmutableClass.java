package com.java9features;
import java.lang.reflect.Array;
import  java.util.*;
//a class object whose state cannot be change after creation
//thread safe   syn perfoermance issue
final public class MyImmutableClass {
   final private List<String> data;
   final private int[]arr;

    public List<String> getData() {
        return new ArrayList<>(data);
    }

    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }

    public MyImmutableClass(List<String> data, int[] arr) {
        this.data = new ArrayList<>(data);

        this.arr = Arrays.copyOf(arr, arr.length);
    }

    @Override
    public String toString() {
        return "MyImmutableClass{" +
                "data=" + data +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
