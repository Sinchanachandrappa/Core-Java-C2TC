package com.tns.firstprog;
import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the TIME");
		int time = Sc.nextInt();
		if (time<6 || time>18)
		{
			System.out.println("light's ON");
		}
	else
		{
			System.out.println("light's OFF");
			
			
		}

	}

}
