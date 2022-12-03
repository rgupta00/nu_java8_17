package com.bankapp.doubts;
import java.util.*;
class Emp {
	double processSalary() {
		return 6_000_000 * 0.8;
	}

	// 2008
	@Deprecated
	@SuppressWarnings({"unchecked","rawtypes"})
	public void oldApi() {
		List list=new ArrayList();
		list.add("foo");
	}
}

class SE extends Emp {
	@Override
	double processSalary() {
		return 60_000_000 * 0.8;
	}
	//2020
    public void newApi() {
    	List<String> list=new ArrayList<>();
		list.add("foo");
	}
}

public class JdkAnnotation {
	public static void main(String[] args) {
		Date date=new Date(2011, 11, 11);
		SE e=new SE();
		e.oldApi();
		e.newApi();
		/*
		 * what is anno: aka meta data java 5 before that xml java readymade anno
		 * customer annotation and that can be processed by java reflection
		 * 
		 * spring hiberate ? "anno+ java reflection + byte code manipulation"
		 * 
		 */
	}

}
