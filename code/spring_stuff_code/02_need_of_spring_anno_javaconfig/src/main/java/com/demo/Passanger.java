package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Passanger is dependent on Vehical
//Spring say i can manage depedency for you

@Component
public class Passanger {
	
	@Value("raja")
	private String name;
	
	@Autowired
	private Vehical vehical;

	public void setName(String name) {
		this.name = name;
	}
	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}


	public String getName() {
		return name;
	}

	public void travel() {
		System.out.println("passanger name:" + name);
		vehical.move();
	}
}
