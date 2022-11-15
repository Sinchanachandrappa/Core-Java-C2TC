package com.tns.MultiThreading;

public class MyThread1  extends Thread{
	public void run()
	{
		try
		{
			for (int i=0;i<5;i++) 
			{
				Thread.sleep(2000);
				System.out.println("Sq_num"+(i*i));
			}
		}
		catch(InterruptedException e)
		{}
	}

}