package com.tns.Interface;

public class Unwrapping {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer a = new Integer(50);
		
		int i = a.intValue(); // here we are converting integer into int explicitly.
		//int j = a;          // unboxing is happening. java compiler will a.intValue() internally.
		
		System.out.println(a+" "+i);
		//System.out.println(a+" "+i+" "j);

	}

}