package com.tns.firstprog;

public class StaticBlockTest {

		// Declare two instance blocks
		{
			System.out.println("instanceblock -1");
		}
		{
			System.out.println("instanceblock -2");
		}
		
		// Declare two static blocks
		static {
			System.out.println("Staticblock -1");
		}
		static {
			System.out.println("Staticblock -2");
		}
		
		// Declare Zero parameters blocks
		StaticBlockTest()
		{
			System.out.println("0 -arg constructor");
		}
		
		// Declare one parameter constructor with the int parameter named a.
		StaticBlockTest(int a)
		{
			System.out.println("1 -arg constructor");
		}
		
		public static void main(String[] args) {
			 
		// create an object of class
			new StaticBlockTest(); // nameless object.
			
			
			// create an object of class and pass an integer argument value.
			new StaticBlockTest(20); 
			}

}