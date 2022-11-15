package com.tns.MultiThreading;

public class MyThread2 extends Thread {
	public void run()
	{
		try
		{
			for (int i=0; i<5; i++) 
			{
				Thread.sleep(2000);
				System.out.println("double_num"+(i*2));
			}
		}
		catch(InterruptedException e)
		{}
	}
	}