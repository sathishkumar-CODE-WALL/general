package com.tryout.randomstuff;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsUtil {

	public static void main(String args[]){
	
		List<Integer> intList = new ArrayList<>();
		intList .add(1);
		intList.add(5);
		intList.add(4);
		intList.add(2);
		intList .add(3);
		intList.add(6);
		
		Stream<Integer> stream = intList.stream();

		
		System.out.println(intList.stream()
		   .filter((i) -> i > 3)
		   .count());

		intList.stream()
		.filter((i) -> i % 2 == 0).forEach(x->System.out.println(x));

		intList.stream()
		 .sorted()
		 .map((i) -> i * i)
		 .forEach(x->System.out.println(x));

		int sum = intList.parallelStream()
		        .filter(i -> i % 2 == 0)
		        .mapToInt(i -> i)
		        .sum();

		//order is not guaranteed in parallelStream
		intList.parallelStream()
		.forEach(i -> System.out.print(i + " "));

		
	}
	
}
