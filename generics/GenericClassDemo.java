package com.tns.generics;

public class GenericClassDemo<T> {
	 GenericClassDemo()
	 {
		 System.out.println("I am generic class");
	 }
	public void genericMethod(T obj)
	{
		System.out.println("I am generic class contains generic method : " +obj.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		GenericClassDemo<Integer>ob=new GenericClassDemo<Integer>();
		Integer a=10;
		ob.genericMethod(a);
		
		GenericClassDemo<String>ob1=new GenericClassDemo<String>();
		String  s="I am String";
		ob1.genericMethod(s);
		
		
		

	}

}