package com.tns.firstprog;

import java.util.Scanner;

public class Watertax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The Amount of water consumed");
		int cons = sc.nextInt();
		if(cons<45)
		{
			System.out.println("No tax");
		}
		else if(cons>45 && cons<75)
		{
				System.out.println("Tax is 475");
		}
		else if(cons>75 && cons<125)
		{
				System.out.println("Tax is 750");
		}
		else if(cons>125 && cons<200)
		{
				System.out.println("Tax is 1225");
		}
		else if(cons>200 && cons<350)
		{
				System.out.println("Tax is 1500");
		}
		else
		{
				System.out.println("Tax is 2000");
		}
	}

}
