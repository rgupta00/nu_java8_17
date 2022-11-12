package com.day1.session2.ex7;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class DemoPerellelProcesing {
	
	public static void main(String[] args) {
		//reducation vs accumulation(X)
		
		// 1 to 1_000_0000========> 500000500000
		long sum=0;
//		for(long i=0;i<=1_00; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		//
//		long []sum2=new long[] {0L};
//		//stream
//		LongStream.rangeClosed(1, 1_00)
//		.parallel()
//		.forEach( i-> sum2[0]+=i);
//		
//		long start= System.currentTimeMillis();
//		
//		
//		AtomicLong sum3=new AtomicLong(0L);
//		//stream
//		LongStream.rangeClosed(1, 1_000_0000)
//		.parallel()
//		.forEach( i->sum3.addAndGet(i));
//		
//		long end= System.currentTimeMillis();
//		System.out.println("time taken : "+ (end-start)+" ms");
//		
//		System.out.println(sum3);
		
		
		
	    long start= System.currentTimeMillis();
		long sum4=0;
		//stream
		sum4=LongStream.rangeClosed(1, 1_000_0000)
		.parallel()
		.reduce(0, (x,y)->x+y);
		
		
		long end= System.currentTimeMillis();
		System.out.println("time taken : "+ (end-start)+" ms");
		System.out.println(sum4);
		
	}

}








