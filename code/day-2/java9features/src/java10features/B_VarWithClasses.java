package java10features;

import java.util.Scanner;

/*
    var with classes and polymorphism
 */
class Parent{
    void doParenting(){
        System.out.println("paranting is not easy!");
    }
}

class Child extends  Parent{
    void run(){
        System.out.println("let run child!");
    }
    void doParenting(){
        System.out.println("by child");
    }
}

class XYZ extends  Parent{
    void run(){
        System.out.println("let run xyz!");
    }
    void doParenting(){
        System.out.println("by xyz");
    }
}

public class B_VarWithClasses {
    public static  void foof(Parent p){
        p.doParenting();
    }
    public static void main(String[] args) {

        var p=new Parent();
        foof(p);

       // Scanner scanner=new Scanner(System.in);
       // System.out.println("1 for childer 2 for xyz");
        //int choice=scanner.nextInt();
//        var parent=new Child();
//        if(choice==1){
//            parent=new Child();
//        }els if(choice==2){
//            parent=new XYZ();
//        }

      //  parent.run();



//        Parent parent=new Child();
//        ((Child) parent).run();
    }
}
