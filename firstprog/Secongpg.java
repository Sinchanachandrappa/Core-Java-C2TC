package com.tns.firstprog;
import java.util.Scanner;
public class Secongpg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,add,sub,mul,div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/b;
		
		System.out.println("The Addition is:" +add);
		System.out.println("The Subtraction is:" +sub);
		System.out.println("The Multiplication is:" +mul);
		System.out.println("The Division is:" +div);
		
		
	}

}
