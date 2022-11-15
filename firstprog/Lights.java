package com.tns.firstprog;
import java.util.Scanner;
public class Lights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter timing");
		int time = sc.nextInt();
		
		if(time>=18)
			System.out.println("Lights on 1");
		else
			System.out.println("Lights off 0");
		
	}

}
