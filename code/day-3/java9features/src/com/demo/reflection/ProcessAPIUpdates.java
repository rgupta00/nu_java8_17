package com.demo.reflection;

public class ProcessAPIUpdates {
    public static void main(String[] args) {
        //till java 8 getting process informatin platefome specfic
        //java 9 :)
        ProcessHandle processHandle=ProcessHandle.current();
        System.out.println( "parent: "+ processHandle.parent());
        System.out.println( "process id: "+ processHandle.pid());
        System.out.println( "isAlive: "+ processHandle.isAlive());
        System.out.println( "childers: "+ processHandle.children());
        System.out.println("class "+processHandle.getClass());

    }
}
