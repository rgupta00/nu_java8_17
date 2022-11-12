package com.day1.session2.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.swing.text.html.parser.Entity;

import com.day1.session1.ex2.Book;

public class AppleTester {

	public static void main(String[] args) {

		List<Apple> apples = Arrays.asList(new Apple("red", 400), new Apple("green", 300), new Apple("green", 200),
				new Apple("red", 250));

		Predicate<Apple> heavyApplePredicate = a -> a.getWeight() >= 250;

		List<Apple> heavyApples = AppleApp.getAllApplesOnPredicate(apples, heavyApplePredicate);

		heavyApples.forEach(a -> System.out.println(a));

		System.out.println("---------------------");
		Predicate<Apple> greenApplePredicate = a -> a.getColor().equals("green");

		List<Apple> greenApples = AppleApp.getAllApplesOnPredicate(apples, greenApplePredicate);

		greenApples.forEach(a -> System.out.println(a));
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		Predicate<Apple> greenAndHeavyApplePredicate =greenApplePredicate.and(heavyApplePredicate).negate() ;
		

		List<Apple> greenAndHeavyApples = AppleApp.getAllApplesOnPredicate(apples, greenAndHeavyApplePredicate);

		greenAndHeavyApples.forEach(a -> System.out.println(a));
		
		
		

		// Most imp functional interface in java 8

		// Predicate

		// Function

		// Consumer

		// biConsumer
		Map<String, Integer> map = new HashMap<String, Integer>();

		// Supplier

		// BiFunction

	}
}
