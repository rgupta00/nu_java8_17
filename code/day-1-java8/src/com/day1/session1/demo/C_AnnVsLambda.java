package com.day1.session1.demo;
class Demo{
	private int i=9;
	public void foo() {
		
		Runnable runnable=()-> {
				int i=98;
				System.out.println("hello..."+Demo.this.i);
				System.out.println("hello..."+this.i);
			
		};
		runnable.run();
	}
}
public class C_AnnVsLambda {
	
	public static void main(String[] args) {
		
		Demo demo=new Demo();
		demo.foo();
	}

}
