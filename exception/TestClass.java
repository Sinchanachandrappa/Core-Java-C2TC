package com.tns.exception;
import java.util.Scanner;
public class TestClass {
	private static int age; 
	static void validate() throws Age
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
		age = sc.nextInt();
		if(age < 18)
			throw new Age ("Invalid Age, you are not eligible to vote");
		else
			System.out.println("welcome to vote");
		}
		public static void main(String[] args) {
			try 
			{
				validate();
			}
			catch(Exception e)
			{
				System.out.println("caught an Exception:\n"+e);
			}
		}
	}