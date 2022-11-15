package com.tns.firstprog;
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		int first,second,add,sub,mul,div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  numbers:");
		
		first = sc.nextInt();
		second = sc.nextInt();
		add = first+second;
		sub = first-second;
		mul = first*second;
		div = first/second;
		System.out.println("Sum of Two numbers = " + add);
		System.out.println("Sub of Two numbers = " + sub);
		System.out.println("Multiplication of Two numbers =" + mul);
		System.out.println("Division of Two numbers =" + div);
		}

}