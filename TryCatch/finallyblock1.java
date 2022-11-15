package com.tns.TryCatch;

public class finallyblock1 {

	public static void main(String[] args) {
		try {
			int arr[]=new int[6];
			arr[3] = 20/0;
			System.out.println("I am in  a try Block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("A number cannot be  divided by zero,illegal operation in java");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Accessing array Elements outside of specified limit");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("I am out of try-catch block");

	}

}