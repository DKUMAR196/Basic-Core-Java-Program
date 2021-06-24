package com.bridgelabz.programming;

import com.bridgelabz.utility.Utility;

public class PrimeFactorization {

	
		public static void main(String[] args) {
			Utility utility = new Utility();
			System.out.println("Enter the number = ");
			int number = utility.getIntValue();
			utility.getPrimeFactor(number);

		}
	}


