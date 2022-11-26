package com.dp.creational.a.singleton;

import java.lang.reflect.Constructor;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args)throws Exception {
//		Runtime runtime=new Runtime();
		
		Singleton singleton1=Singleton.getSingleton();
		
		//how it can be broken using java reflection
//		Class<?> clazz=Class.forName("com.dp.creational.a.singleton.Singleton");
//		
//		Constructor[]constructors=clazz.getDeclaredConstructors();
//		constructors[0].setAccessible(true);//even i wanna to call private ctr
//		
//		Singleton singleton2 = (Singleton)constructors[0].newInstance();
		
		//API
		
		//Singleton singleton2=(Singleton) singleton1.clone();
		
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.ser")));
//		oos.writeObject(singleton1);
//		
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.ser")));
//		
//		Singleton singleton2=(Singleton) ois.readObject();
		
		//Serilization , clonning , java reflection
		
		//System.out.println(singleton1==singleton2);
		
	}
}
