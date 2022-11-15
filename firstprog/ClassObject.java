package com.tns.firstprog;
//Program to show classes and objects
public class ClassObject {
	String make;//Data members
	int model;
	double cost;
	int Yearofpurchase;
	public void display1()
	{
		System.out.printf("year of purchase" +2001);
		System.out.printf("make"+ "suzuki");
	}
	public void display2()
	{
		System.out.printf("model" +2000);
		System.out.printf("cost" +700000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassObject ob1 = new ClassObject();
		ob1.display1();
		ob1.display2();
	}

}