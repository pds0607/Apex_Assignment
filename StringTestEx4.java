package org.apex.assignment;

import java.util.Scanner;

public class StringTestEx4 {

	public static void main(String[] args) {
		String strInput;

		System.out.print("Enter number string: ");
		Scanner inputString = new Scanner(System.in);
		
		strInput = inputString.next();
		
		System.out.println(strInput + ((isInteger(strInput) == true) ? " is an integer": " is not an integer"));
		System.out.println(strInput + ((isOddNumber(strInput) == true) ? " is odd": " is not odd"));
		System.out.println(strInput + ((isEvenNumber(strInput) == true) ? " is even": " is not even"));
		System.out.println(strInput + ((isPrimeNumber(strInput) == true) ? " is prime" : " is not prime"));	
		inputString.close();
	}
	
	/**
	 * method to check that give string is a prime number or not
	 * @param str - input string 
	 * @return - true if input string is prime else return false
	 */
	public static boolean isPrimeNumber(String str)
    {				
		/* check if input string is a number, if not a number return false */
		if (isInteger(str) == true) {			
			int n = Integer.parseInt(str);
			/* if input number is 1 return true */
			if (n == 1) {
				return true;
			} else {
				for (int x = 2; x < n; x++ ) {
					if (n % x == 0) 
						return false;
				}
				return true;
			}
			
		} else 
			return false;		
    }
	
	public static boolean isEvenNumber(String str)
    {		
		/* check if input string is a number, if not a number return false */
		if (isInteger(str) == true ) {
			int n = Integer.parseInt(str);
			if (n %2 == 0) 
				return true;
			else
				return false;
		} else 
			return false;		
    }
	
	public static boolean isOddNumber(String str)
    {
		/* check if input string is a number, if not a number return false */
		if (isInteger(str) == true ) {
			int n = Integer.parseInt(str);
			if (n %2 == 0) 
				return false;
			else
				return true;
		} else 
			return false;
    }
	
	
	public static Boolean isInteger(String str) {
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			
			if (Character.isDigit(a) == true) { 
				;
			} else {
				return false;
			}			
		}
		return true;
		
	}
}
