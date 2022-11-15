package com.tns.firstprog;
import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the amount of Water Consumed in (gallons)");
		int cons = Sc.nextInt();
		if (cons<45){
			System.out.println("No TAX");}
		else if(cons>45 && cons<75) {System.out.println("tax is 475");}
		else if(cons>75 && cons<125) {System.out.println("tax is 750");}
		else if(cons>125 && cons<200) {System.out.println("tax is 1225");}
		else if(cons>200 && cons<350) {System.out.println("tax is 1500");}
		else  {System.out.println("tax is 2000");}
	
		

	}

}