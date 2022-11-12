package com.day1.session2.ex6;

import java.util.Optional;

/*
 * 		may have a	 may hv ins		but must have name
 * Person -----> Car---> Insurance--> name
 */

class Insurance{
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}

class Car{
	private Optional<Insurance> insurance;

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}

	
	
}

class Person{
	private Optional<Car> car;

	public Optional<Car> getCar() {
		return car;
	}

	public void setCar(Optional<Car> car) {
		this.car = car;
	}

	
}
public class DemoOptional2 {

	public static void main(String[] args) {
		
		Insurance insurance=new Insurance();
		insurance.setCompanyName("comviva");
		Optional<Insurance> optInsurence= Optional.ofNullable(null);
		
		Car car=new Car();
		car.setInsurance(optInsurence);
		
		Optional<Car> optCar=Optional.ofNullable(car);
		
		Person person=new Person();
	
		person.setCar(optCar);
		
		Optional<Person> optPerson=Optional.ofNullable(person);
		
		String name=getInsurceCompanyName(optPerson);
		System.out.println(name);
	}

	private static String getInsurceCompanyName(Optional<Person> optPerson) {
//		Optional<Optional<Car>> map = optPerson.map(p-> p.getCar());
		return optPerson.flatMap(p-> p.getCar())
				.flatMap(c->c.getInsurance())
				.map(i->i.getCompanyName()).orElse("company name is not found");
		
	}

	
}






