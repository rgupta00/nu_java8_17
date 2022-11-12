package com.day1.session2.ex3;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class AppleApp {
	//OCP
	public static List<Apple> getAllApplesOnPredicate(List<Apple> apples, Predicate<Apple> predicate){
		return apples.stream().filter(predicate).collect(Collectors.toList());	
	}
}
