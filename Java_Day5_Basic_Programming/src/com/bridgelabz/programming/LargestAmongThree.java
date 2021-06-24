package com.bridgelabz.programming;

import com.bridgelabz.utility.Utility;

public class LargestAmongThree {	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter First Number: " );
		int number = utility.getIntValue();
		System.out.println("Enter Second Number: ");
		int number1 = utility.getIntValue();
		System.out.println("Enter Third Number : ");
		int number2 = utility.getIntValue();
		utility.getLargestNumber(number, number1, number2);
	}

}