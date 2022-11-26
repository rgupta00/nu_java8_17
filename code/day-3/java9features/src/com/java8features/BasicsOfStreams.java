package com.java8features;
@FunctionalInterface
interface Foo{
    void  foof();
    public boolean equals(Object obj);
    default  void  foofDefault(){
        System.out.println("foof defalt");
    }
    public  static void foofStatic(){
        System.out.println("foof static method");
    }
}
public class BasicsOfStreams {
    public static void main(String[] args) {

        Foo foo=() ->System.out.println("foof is overriden");


    Thread thread=new Thread(()-> System.out.println("job of threads..."));

    //Predicate, Function, Consumer, Supplier



        //interface evoluation=> functional interface => lammbda expression =>
        //=>stream processing

    }
}