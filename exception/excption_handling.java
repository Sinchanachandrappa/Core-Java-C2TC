package com.tns.exception;

public class excption_handling {

	public static void main(String args)

	{

	try

	{
	int a = args.length();
	int b = 10 / a;
	System.out.print(a);

	}
	catch (ArithmeticException e)

	{
	

	System.out.println("1");
	}
	}
}