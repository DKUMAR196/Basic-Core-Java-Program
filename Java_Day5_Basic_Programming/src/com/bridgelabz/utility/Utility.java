package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
Scanner scanner;

public Utility() {
scanner = new Scanner(System.in);
}
public int getIntValue() {
	return scanner.nextInt();
}

		//flip coin percentile
public static void flipCoin(int numberOfFlip) {
	double heads = 0, tails = 0;
	for(int i = 0; i<numberOfFlip; i++) {
		double side = Math.random();
		if(side>0.5) {
			heads++;
			
		}
		else {
			tails++;
		}
		
	}
     System.out.println("Number of head occurance ::" + heads);
     System.out.println("Number of head occurance ::" + (numberOfFlip-heads));
     double headPercent = ((heads * 100)/numberOfFlip);
     double tailPercent = ((tails * 100)/numberOfFlip);
     System.out.println("Heads Percentage ::" + headPercent + "%");
     System.out.println("Tails Percentage ::" + tailPercent + "%");

}

           //LEAP YEAR
public void checkLeapYear(int ValueOfYear) {
	int temp = ValueOfYear, noOfDigit=0;
	do {
		noOfDigit++;
		ValueOfYear /= ValueOfYear/10;
	}while(ValueOfYear != 0);
	if(noOfDigit == 4) {
		
		if((temp % 4 == 0 || temp % 400 == 0) && temp % 100 == 0){
			System.out.println(temp+" is a Leap Year");
		}
		else 
			System.out.println(temp+" is not Leap Year");
		}
		else 
			System.out.println(temp+"is not valid Leap Year");
	}

      //POWER OF TWO
public void getPowerOfTwo(int n) {
	if (n>=0 && n<=31) {
		int power = 0;
		for (int i=0; i<=n; i++) {
			power = (1<<i);
			System.out.println("2^"+i+ "  =  "  +power);
		}
	}
}

       //EVEN ODD
public void getEvenOdd(int num) {
	if(num%2 == 0)
		System.out.println(num+" is even number");
	else
		System.out.println(num+" is odd number");
}

       //QUOTIENT REMAINDERE
public void getQuotientRemainder(int Dividend, int Divisor ) {
	int Quotient, Remainder;
	Remainder = Dividend % Divisor;
	Quotient = Dividend / Divisor;
	System.out.println(" Remainder = " +Remainder+ " Quotient = " +Quotient);
	
}

      //SWEAP THE NUMBER
public void SwapNumber(int num1 ,int num2) {
	int temp;
	temp = num1;
	num1 = num2;
	num2 = temp;
	System.out.println("num1 = "+num1+" num2 = "+num2);
}

       //VOWEL OR CONSONENT
public void checkAlphabate(char alphabates) {
	boolean vowel ;
	if(alphabates == 'a' || alphabates == 'A')
		vowel  = true;
	else if(alphabates == 'e'|| alphabates == 'E')
		vowel  = true;
	else if(alphabates == 'i'|| alphabates == 'I')
		vowel  = true;
	else if(alphabates == 'o'|| alphabates == 'O')
		vowel  = true;
	else if(alphabates == 'u'|| alphabates == 'U')
		vowel  = true;
	else
		vowel = false;
	
	if (vowel)
		System.out.println(alphabates+" is vowel");
	else
		System.out.println(alphabates+" is Consonent");
}


         //HARMONIC NUMBER
public void getHarmonic(int num) {
	float sum = 0;
	for (float i=1;i<=num;i++) {
		sum+=1/i;
	}
	System.out.println("Nth Harmonic Value =" +sum);

}


        	//FACTOR
public void getPrimeFactor(int num) {
	for(int i=2;i<num;i++) {
		int cnt = 0;
		if (num%i == 0) {
		
			for(int j=2;j<i;j++) {
				if (i%j == 0) {
					cnt = 1;
				}
				
			}
			if (cnt == 0)
				System.out.println("Prime factor = " +i);
		}
	 }
   }

		//LARGEST AMONG THREE
public void getLargestNumber(int num1, int num2, int num3) {
	int Firstnum, Secondnum;
	Firstnum = (num1>num2)? num1:num2; 
	Secondnum = (Firstnum>num3)? Firstnum:num3; 
	System.out.println(Secondnum+" is greatest among "+num1+", "+num2+", "+num3);
}

}


