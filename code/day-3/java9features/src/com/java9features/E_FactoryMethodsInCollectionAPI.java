package com.java9features;
import java.util.*;
public class E_FactoryMethodsInCollectionAPI {
    public static void main(String[] args) {
        //how to create unmodificatiale collection
//        List<String > list=new ArrayList<>();//Arrays.asList()
//        list.add("foo");
//        list.add("bar");
////
//        List<String> list2=Collections.unmodifiableList(list);

      //  list2.add("foo 2");
       // list2.add(0,"new foo");

        //List<String> list=List.of("foo","bar");


      //  Set<String> set=Set.of("foo","bar");


//        Map<String, String> map=new HashMap<>();
//        map.put("india","delhi");
//        map.put("usa","NY");
//        Map<String, String> map2=Collections.unmodifiableMap(map);
//
//        map2.put("foo","abc");
//        System.out.println(map2);

  //      Map<String, Integer> map=Map.of("amit",90,"ekta",88,"raj",77);
//        map.forEach((name, marks)-> System.out.println(name+" : "+ marks));

     //   Map<String, Integer> map=Map.of("amit",90,"ekta",88,"raj",77);
      //Map.of vs Map.ofEntries

//        Map.Entry<String, Integer> e1=Map.entry("amit",90);
//        Map.Entry<String, Integer> e2=Map.entry("sumit",97);
//       Map.Entry<String, Integer> e3=Map.entry("kapil",70);
//
//        Map<String, Integer> map2=Map.ofEntries(e1, e2,e3);

      //  Map<String, Integer> map2=Map.ofEntries(Map.entry("amit",90), Map.entry("sumit",97),Map.entry("kapil",70));


        //list.add("java");
      //  myLogic(list);

    }

    private static void myLogic( final  List<String> list) {
        list.add(0,"raj");
    }
}
