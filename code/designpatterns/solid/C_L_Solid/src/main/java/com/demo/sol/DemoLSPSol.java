package com.demo.sol;
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
class Square{

	private Rectangle rectangle;
	
	public Square(int l) {
		rectangle=new Rectangle(l, l);
	}
	
	public int getArea() {
		return rectangle.getArea();
	}
	
}
public class DemoLSPSol {
	public static void main(String[] args) {
		
		Square square=new Square(4);
		System.out.println(square.getArea());
	//	square.setB(8);
		System.out.println(square.getArea());
	}

}





