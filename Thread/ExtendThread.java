package com.tns.Thread;

public class ExtendThread extends Thread {
	public void run() {
		System.out.println("welcome");
		
	}

	public static void main(String[] args) {
		ExtendThread  t1 =  new ExtendThread ();
			t1.start();
	}

}