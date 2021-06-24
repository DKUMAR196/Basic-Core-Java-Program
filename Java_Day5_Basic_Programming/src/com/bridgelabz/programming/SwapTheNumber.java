package com.bridgelabz.programming;

import com.bridgelabz.utility.Utility;

public class SwapTheNumber {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the First Number: " );
		int firstNumber = utility.getIntValue();
		
		System.out.println("Enter the Second Number: " );
		int SecondNumber = utility.getIntValue();
		utility.SwapNumber(firstNumber,SecondNumber);
		
		}

}