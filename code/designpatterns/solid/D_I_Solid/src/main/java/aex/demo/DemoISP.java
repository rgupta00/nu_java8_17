package aex.demo;
//ISP
interface Flyable{
	public void fly() ;
}

interface Swimable{
	public void swim() ;
}
class Bird {
	public void eat() {
		System.out.println("eating ...");
	}
	
	public void sound() {
		System.out.println("sound ...");
	}

}
class XYZ extends Bird implements Flyable, Swimable{

	@Override
	public void swim() {
		
	}

	@Override
	public void fly() {
		
	}
	
}
class Eagle extends Bird implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
class Duck extends Bird implements Swimable{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}

public class DemoISP {

	public static void main(String[] args) {
		/*
		 * Interface Pollution problem
		 * => classes have empty method implementation
		 * => method throws UnSupporedExceptions
		 * => Method implementation return null or return dummy values
		 * 
		 */
	}
}
