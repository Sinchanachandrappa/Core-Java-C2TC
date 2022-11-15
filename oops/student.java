package com.tns.oops;
//""""""""ENCAPSULATION""""""""
public class student {
	// Private data members
	private String studentName;
	private int studentRollno;
	private int studentage;

	// Getter method for student name to access private variable studentName
	public String getstudentName() {
	return studentName;
	}

	// Setter method for student name to set the value in private variable studentName
	public void setStudentName(String studentName) {
	this.studentName = studentName;
	}
	
	// Getter method for student rollno to access private variable studentRolLno
	public int getStudentRollno() {
	return studentRollno;
	}

	// Setter method for student rollno to set the value in private variable studentRoi
	public void setStudentRollno(int studentRollno) {
	this.studentRollno = studentRollno;
	}

	// Getter method for student age to access private variable studentAge
	public int getStudentAge() {
	return studentage;
	}

	// Setter method for student age to set the value in private variable studentAge
	public void setstudentage(int studentAge) {
	this.studentage = studentAge;
	}
	
	
	// File Name: StudentDetails. java

	public class StudentDetails {
		
	}
	public static void main(String args[]) {
		student obj = new student();

		// Setting the values of the variables
		obj. setStudentName("Rahul");
		obj.setStudentRollno(101) ;
		obj. setstudentage(22);

		// Printing the values of the variables

		System.out.println("Student Name : " + obj.getstudentName());

		System.out.println("Student Rollno : " + obj.getStudentRollno());

		System.out.println("Student Age : " + obj.getStudentAge());
	}

}