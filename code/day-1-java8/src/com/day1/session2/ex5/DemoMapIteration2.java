package com.day1.session2.ex5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DemoMapIteration2 {
	
	public static void main(String[] args) {
	      Map<Emp, String> mapData=new HashMap<>();
	      mapData.put(new Emp(2, "rajat", 4000), "Ravi");
	      mapData.put(new Emp(62, "seema", 8000), "Kapil");
	      
	      
	      String name= mapData.get(new Emp(2, "rajat", 4000));
	      
	      System.out.println(name);
	      
	      
	     
	     //mapData.forEach(( key,  value)-> System.out.println(key + " : "+ value));
//	     mapData.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" : "+ e.getValue()));
	      
	      // java.lang.ClassCastException: class java.util.HashMap$Node cannot be cast to class java.lang.Comparable 
//	      mapData.entrySet()
//	      .stream()
//	      .sorted(Map.Entry.comparingByKey(Comparator.comparing(Emp::getSalary).reversed()))
//	      .forEach(e-> System.out.println(e.getKey()+" : "+ e.getValue()));
	}

}
