package org.sample;

import org.openjdk.jmh.annotations.Benchmark;

public class Benchmarking {

	public Boolean isPrime(Integer testNumber) {
		for (Integer i = 2; i < testNumber; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}
	
	//version 2
	public Boolean isPrime2(int testNumber) {
		int maxToCheck=(int) Math.sqrt(testNumber);
		
		for (int i = 2; i <= maxToCheck; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}
	
	@Benchmark
	public void version1() {
		for(int i=0;i<5000; i++) {
			isPrime(i);
		}
	}
	@Benchmark
	public void version2() {
		for(int i=0;i<5000; i++) {
			isPrime2(i);
		}
	}
	
}
