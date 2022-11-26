package com.oops;
class Foo{
    void foof(){
        System.out.println("foof method of foo class");
    }
}
public class DemoClassNotFoundEx {
    public static void main(String[] args) {
        try{
            Class.forName("com.oops.Foo2");// java reflection *
            System.out.println("class is found");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
