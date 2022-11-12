package com.day1.session2.ex5;

import java.util.HashMap;
import java.util.Map;

public class DemoMapIteration {
	
	public static void main(String[] args) {
	      Map<String, String> mapData=new HashMap<>();
	      mapData.put("Yndia", "Delhi");
	      mapData.put("Pak", "xyz");
	      mapData.put("Xaaa", "pqr");
	
	      
	      
	      
	     //mapData.forEach(( key,  value)-> System.out.println(key + " : "+ value));
//	     mapData.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" : "+ e.getValue()));
	      
	      // java.lang.ClassCastException: class java.util.HashMap$Node cannot be cast to class java.lang.Comparable 
	      mapData.entrySet()
	      .stream()
	      .sorted(Map.Entry.comparingByKey())
	      .forEach(e-> System.out.println(e.getKey()+" : "+ e.getValue()));
	}

}
