package com.bridgelabz.programming;

import com.bridgelabz.utility.*;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the power of two number");
		int Number = utility.getIntValue();
		utility.getPowerOfTwo(Number);
		
	}

}
