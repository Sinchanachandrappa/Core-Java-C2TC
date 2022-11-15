 package com.tns.Interface;

public class Wrapping {

	public static void main(String[] args) {
		int a = 50; //primitive data type value.
		
		Integer i = Integer.valueOf(a); //Here we can convert int into Integer explicitly
		//Integer j = a; // here Autoboxing is happening.java compiler will write Integer .value of (a)
		
		System.out.println(a+" "+i);
		//System.out.println(a+" "+i+" "j);
		

	}

}