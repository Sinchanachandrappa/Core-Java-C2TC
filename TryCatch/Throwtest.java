package com.tns.TryCatch;

public class Throwtest {

	public static void main(String[] args) {
		int x = 20;
		int y = 0;
		try
		{
		int z = x/y; 
		System.out.println("Result:"+z);
		throw new ArithmeticException();
//		System.out.println("Result:"+z); // unreachable code. u cannot write after the throw block it tells unreachable code.
		}
		catch(ArithmeticException ae){
			System.out.println("Exception caught:\n" +ae);
		}

	}

}