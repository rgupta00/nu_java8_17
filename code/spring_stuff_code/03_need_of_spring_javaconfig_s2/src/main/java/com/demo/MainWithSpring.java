package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class MainWithSpring {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

		Passanger passanger =ctx.getBean("passanger", Passanger.class);
		

		passanger.travel();
	}
}
