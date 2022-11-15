package com.tns.Thread;

public class ImplementRunnable  implements Runnable{
	public void  run() {
		System.out.println("welcome to second way of creating thread");
	}

	public static void main(String[] args) {
		ImplementRunnable ob1 = new ImplementRunnable();
		Thread ob2 = new Thread(ob1);
		ob2.start();

	}

}