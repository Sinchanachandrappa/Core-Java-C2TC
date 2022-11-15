package com.tns.TryCatch;

public class finallyblock {

	public static void main(String[] args) {
		int a = 20,b=0;
		try {
			System.out.println("Value of a:" +a);
			System.out.println("Value of a:" +b);
			int div =a/b;
			System.out.println("Division:"+div);
		}
		catch(NullPointerException npe)
		{
			System.out.println(npe);
		}
		finally
		{
			System.out.println("Denominator cannot be Zero");
		}
		{
			System.out.println("Hello java");
		}
		
	}

}