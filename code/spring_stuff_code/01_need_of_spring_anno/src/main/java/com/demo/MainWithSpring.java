package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWithSpring {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");

		Passanger passanger =ctx.getBean("passanger", Passanger.class);
		
		Passanger passanger2 =ctx.getBean("passanger", Passanger.class);

		System.out.println(passanger==passanger2);
		passanger.travel();
	}
}
