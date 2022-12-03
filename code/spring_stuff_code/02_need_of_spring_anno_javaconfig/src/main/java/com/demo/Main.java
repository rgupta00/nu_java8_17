package com.demo;

public class Main {

	public static void main(String[] args) {
		
		//Passanger is moving in car
		
		//Passanger --> Vehical
		//DI rather then passsanger is looking for vehical , vehical is pushed to the passanger
		
		Vehical vehical=new Metro();
		
		Passanger passanger=new Passanger();
		
		passanger.setName("ravi");
		passanger.setVehical(vehical);
		passanger.travel();
	}
}
