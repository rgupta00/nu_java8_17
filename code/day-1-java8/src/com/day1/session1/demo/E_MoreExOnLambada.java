package com.day1.session1.demo;

interface Cal{
	public int add(int a, int b);
	public static void addStatic() {
		System.out.println("it is default method");
	}
}

public class E_MoreExOnLambada {
	
	public static void main(String[] args) {
		
		Cal cal=(int a, int b)-> {
			//	Cal.addStatic();
				return a+b;
			};
			
		
		//cal.addDefault();
		
//		Cal cal=(a, b)-> a+b;
//		cal.addDefault();
		
		System.out.println(cal.add(3, 3));
					
	}

}
