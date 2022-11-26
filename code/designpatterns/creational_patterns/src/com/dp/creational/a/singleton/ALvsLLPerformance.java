package com.dp.creational.a.singleton;
import java.util.*;
public class ALvsLLPerformance {
	
	public static void main(String[] args) {
		
		//LinkedList vs ArrayList
		//time taken: 1202 ms
		//time taken: 7 ms

		List<Integer> list=new LinkedList<>();
		
		doProcessing(list);
		
	}
	 static void doProcessing(List<Integer> list) {
		 long start=System.currentTimeMillis();
		 
		 for(int i=0;i<1E5;i++) {
			 list.add(i);
		 }
		 
		 for(int i=0;i<1E5;i++) {
			 list.add(0,i);
		 }
		 
		 long end=System.currentTimeMillis();
		 System.out.println("time taken: "+ (end-start)+" ms"); 
	}
}
