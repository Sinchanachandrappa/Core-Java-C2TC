package com.tns.MultiThreading;

public class MultiThreadedDemo {

	public static void main(String[] args) {
		System.out.println("main method...!");
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		
		t1.start();
		t2.start();

		//t1.start();
		//t2.start();
		
	}

}