package com.tns.TryCatch;

public class Multicatch {

	public static void main(String[] args) {
		try
		{
			int arr[]= new int[6];
			//arr[9]= 20/0;
			//int a = 20/0;
			arr [7] =50;
			int a = 20/0;
			System.out.println("i am in try block");
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("accesingarray elememnts outside of specified limit");
		}
		catch(ArithmeticException ae){
			System.out.println("a number cannot be divided");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("i am out of try-catch block");
	}

}