package com.bridgelabz.programming;

import com.bridgelabz.utility.Utility;

public class QuotientRemainder {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the Dividend: " );
		int Dividend = utility.getIntValue();
		System.out.println("Enter the Divisor: " );
		int Divisor = utility.getIntValue();
		utility.getQuotientRemainder(Dividend, Divisor);
	}

}
