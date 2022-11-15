package com.tns.exception;
import java.util.*;
public class Test {
	  public static void isValid(String email)
	        throws Email
	    {
		  	if (!(email.length()<7)) // for checking if password length is between 8 and 15
		    {
	            throw new Email(1);
	        }
		  	if (email.contains(" ")) {   // to check space
	            throw new Email(2);
	        }
		  	if (!email.contains("@"))      // for special characters
		  	{
	            throw new Email (4);
	        }
		  	if (true) {
	           int count = 0;
	           for (int i = 65; i <= 90; i++) {  // checking capital letters
	        	   	char c = (char)i;  // type casting
	  
	                String str1 = Character.toString(c);
	                if (email.contains(str1)) 
	                {
	                    count = 3;
	                }
	            }
	            if (count == 0) {
	                throw new Email(4);
	            }
	        }
		  	if (true) {
	            int count = 0;
	  
	            for (int i = 90; i <= 122; i++) {// checking small letters
	            	char c = (char)i;    // type casting
	                String str1 = Character.toString(c);
	  
	                if (email.contains(str1)) {
	                    count = 2;
	                }
	            }
	            if (count == 0) {
	                throw new Email(5);
	            }
	        }
	}                   // The Email is valid
	  
	  public static void main(String[] args)
	    {
	         Scanner sc=new Scanner(System.in);	         
	         System.out.print("Enter Email:");
	         String password1 =sc.next();
	         try {
	           
	            isValid(password1);
	            System.out.println("Valid Email");
	        }
	        catch (Email e) {
	            System.out.print(e.getMessage());
	            System.out.println(e.printMessage());
	        }
	    }
	}