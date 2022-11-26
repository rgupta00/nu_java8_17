package com.dp.creational.a.singleton;

import java.io.Serializable;

/*
 	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum
 */
public class Singleton implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	
	private volatile static Singleton singleton;
	private Singleton() {
		if(singleton!=null) {
			throw new IllegalStateException();
		}
	}
	
	//t1 t2 broken, double lock checking is broken=> 
	public static Singleton getSingleton() {
		if(singleton==null) {
			synchronized (Singleton.class) {
				if(singleton==null) {
					singleton=new Singleton();
				}
			}
		}
		
		return singleton;
	}
	//JVM will call this method rather then doing de-ser *
	private Object readResolve() {
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		//return super.clone();
	}
	
	

}









