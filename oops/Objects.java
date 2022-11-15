package com.tns.oops;
class Rectangle {

	// Member variables
	double width;
	double height;
}

public class Objects {

	public static void main(String[] args) {
		// Creating an object of Box class
		Rectangle obj = new Rectangle();

		// Assigning values to obj instance variables
		obj.width = 5;

		obj.height = 10;

		

		// Computing the volume of the box
		double volume = obj.width * obj.height ; 

		System.out.println("Volume of Rectangle:" + volume);
		

	}

}