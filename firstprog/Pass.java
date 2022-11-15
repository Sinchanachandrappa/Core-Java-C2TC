package com.tns.firstprog;
import java.util.*;
public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		            Scanner inp = new Scanner(System.in);
				System.out.print("\n Enter Pssword: ");
				String s = inp.nextLine();
				
				
			
		             
		            if (!(s.length()<7)) {
		            	System.out.println("Lenght shoiuld be 6 Character");
		              System.exit(0);
		            }
		           char c;
		           int cp=0;
		           int lc=0;
		           int sp=0;
		           for (int i = 0; i<s.length(); i++) {
					c = s.charAt(i);
		               if(c>=65 && c<=90){
		                  cp++; 
		               }
		               if(c>=97 && c<=122){
		                   lc++;
		               }
		               
		                if(c>=33 && c<=43 || c==64){
		                   sp++;
		               }
		           }
		           
		          if(cp==3){
		              if(lc==2){
		                  if(sp==1){
		                      System.out.println("vaild password");
		                  }
		              }
		          }}}


