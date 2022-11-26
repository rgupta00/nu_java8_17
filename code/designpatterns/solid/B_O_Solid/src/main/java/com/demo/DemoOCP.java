package com.demo;
//O:OCP: 
interface Operation {
	int apply(int a, int b);
}

//OCP
 class Calculator{
	int add ( int a , int b, Operation operation) {
		return operation.apply(a, b);
	}
}
public class DemoOCP {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		System.out.println(calculator.add(2, 2, (int a, int b)-> a+b));
		System.out.println(calculator.add(2, 2, (int a, int b)-> a*b));
	}
}
