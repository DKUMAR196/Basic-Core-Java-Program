package com.bridgelabz.programming;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter number of time to flip");
		int numberOfFlip = utility.getIntValue();
		utility.flipCoin(numberOfFlip);
	}
}