package com.tns.firstprog;
//single inheritance
class withdraw //parent class
{
	int amt_with=1000; //p class
	void show()
	{
		System.out.println("Super Class");
	}
}
class Deposit extends withdraw
{
	int amt_deposit=15000;
	void show()
	{
		System.out.println("Child Class");
		super.show();
	}
	
}
public class atm extends withdraw { // child class
int amt_left=1500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atm ob=new atm();
		ob.show();
		Deposit ob1 = new Deposit();
		System.out.println("amt withdraw"+ob.amt_with);
		System.out.println("amt left"+ob.amt_left);
		System.out.println("amt deposit"+ob1.amt_deposit);

	}

}