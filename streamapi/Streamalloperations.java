package com.tns.streamapi;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Streamalloperations {

	public static void main(String[] args) {
		
		// count the empty String
		List<String> strList = Arrays.asList("abc","efhg","","","ijk"); 
		Long count = strList.stream() // creation of stream
				.filter(x -> x.isEmpty())
				.count();
		System.out.printf("list %s has %d empty strings % n", strList,count);
		
		
		// count string with length more than 3
		long num = strList.stream() 
				.filter(x -> x.length() > 3)
				.count();
		System.out.printf("list %s has %d string  of length more than 3 % n", strList,num);
		
		
		// remove all empty string from 
		List<String> filtered = strList.stream()
				.filter(x -> x.isEmpty())
				.collect(Collectors.toList());
		System.out.printf("origianl list : % s, list Without Empty String : %s %n",strList, filtered);
		
		// create list of square of all distunct numbers
		List<Integer> numbers = Arrays.asList(4,5,7,2,9);
		List<Integer> distinct = numbers.stream()
				.map(i -> i*i).distinct()
				.collect(Collectors.toList());
		System.out.printf("Orginal List :%s ,square without duplicates : %s %n ",numbers, distinct);
		
		
		// Get count ,min max, sum, and avereage for numbers
		
		List<Integer> primes = Arrays.asList(2,4,5,6,7,8,9);
		IntSummaryStatistics stats = primes.stream()
				.mapToInt((x) -> x)
				.summaryStatistics();
		System.out.println(" Highest prime number in list :" + stats.getMax());
		System.out.println(" lowest prime number in list :" + stats.getMin());
		System.out.println(" Sum of all prime numbers:" + stats.getSum());
		System.out.println(" Average of all  prime number in list :" + stats.getAverage());
		
	}

}