package com.bridgelabz.programming;

import com.bridgelabz.utility.Utility;
public class LeapYear {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the year to check the leap year or not");
		int ValueOfYear = utility.getIntValue();
		utility.checkLeapYear( ValueOfYear); 
			
		

	}

}
