package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamoperations {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("1", "2","3", "4","5","6");
		System.out.println("original list :" + numbers);
		List<Integer> even = numbers.stream() // create a stream
				
				
				.map(S -> Integer.valueOf(S))// convert stream of string to stream
				.filter(number -> number % 2 == 0) // find out the even numbers
				.collect(Collectors.toList()); //it collects into a list
				
		System.out.println("processed list,only even numbers" + even);
	}
	
}