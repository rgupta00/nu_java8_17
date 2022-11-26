package java10features;
import java.sql.SQLException;
import  java.util.*;


public class A_DemoVar {
//    static {
//       var a=44;
//    }
//    void foo(){
//        var f="foo";
//    }
    public static void main(String[] args) {
        //strongly vs loosly "typed" language
        //java          js

        //1. u must initilized before first use
        var m=11;
        //2. u can only definal local var , not instance , static
        var a=33;//still java is strongly type language
        var map=new HashMap<String, Integer>();
        //3. u cant change the datatype
        //a=55;

        //4. var in catch block will not work
//        try{
//            if(1==1)
//                throw  new SQLException();
//        }catch (var e){
//
//        }

    //. var with classes



    }
}
