package com.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bankapp01Application {

	public static void main(String[] args) {
		ApplicationContext ctx=  SpringApplication.run(Bankapp01Application.class, args);
//		String []beanNames=ctx.getBeanDefinitionNames();
//		for(String bean: beanNames) {
//			System.out.println(bean);
//		}
	}

}
