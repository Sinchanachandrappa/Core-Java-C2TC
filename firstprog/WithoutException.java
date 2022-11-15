package com.tns.firstprog;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0;
		System.out.println("print the value of d" +d);
		try {
			int a=42/d; //exception occurs in this line
			System.out.println("hello");
			
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}
		System.out.println("will not be printed");
		
		}
	}

