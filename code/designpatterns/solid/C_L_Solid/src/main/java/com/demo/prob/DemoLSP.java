package com.demo.prob;
class Rectangle{
	private int l, b;

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int getArea() {
		return l*b;
	}
}
class Square extends Rectangle{

	public Square(int l) {
		super(l, l);
	}
	
}
public class DemoLSP {
	public static void main(String[] args) {
		
		Square square=new Square(4);
		System.out.println(square.getArea());
		square.setB(8);
		System.out.println(square.getArea());
	}

}





