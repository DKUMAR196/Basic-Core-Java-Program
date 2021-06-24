package com.bridgelabz.programming;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
	
	public class VowelOrConsonent {
		
		public static void main(String[] args) {
			Utility utility = new Utility();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Alphabates: " );
			char Alphabates = sc.next().charAt(0);
			utility.checkAlphabate(Alphabates);
			
		}
	}


