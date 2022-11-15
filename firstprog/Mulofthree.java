package com.tns.firstprog;
import java.util.Scanner;
public class Mulofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num = sc.nextInt();
		if(num%3==0)
		{
			System.out.println("Number is multiple of 3");
		}
		else
		{
			System.out.println("Number is not multiple of 3");
		}
	}

}
