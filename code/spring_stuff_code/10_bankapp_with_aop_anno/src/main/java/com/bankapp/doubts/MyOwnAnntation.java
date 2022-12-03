package com.bankapp.doubts;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//-------1---create the annotation-----------
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	public String hello() default "java champs";
	public boolean isDone() default false;
}

class MyFoo{
	//-------2-----apply it-----------
	@MyAnno
	void foo() {
		System.out.println("foo method of myfoo class");
	}
		
}
////-------3---process the annotation by java reflection*-----------

public class MyOwnAnntation {
	
	public static void main(String[] args) throws Exception {
		//u can process it using reflection 
		Class<?> clazz=Class.forName("com.bankapp.doubts.MyFoo");
		
		Method []methods=clazz.getDeclaredMethods();
		for(Method method: methods) {
			if(method.isAnnotationPresent(MyAnno.class)) {
				MyAnno anno=method.getDeclaredAnnotation(MyAnno.class);
				System.out.println(anno.hello()+": "+ anno.isDone());
			}
		}
	}

}















