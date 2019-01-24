/*Write a class BasicCalulator.java to provide basic mathematical operation like additional, subtractions, 
 * multiplications, and division for two numbers. Write a client to use above class and call its operations.
 */
package org.apex.assignment;

public class BasicCalulatorEx3 {
		
	/**
	 * Method to perform addition operation for given arguments 
	 * @param num1 First number for addition
	 * @param num2 Second number for addition
	 * @return sum of num1 and num2 -> num1 + num2
	 */
	static double addMethod(double num1, double num2) {
		return num1 + num2;
	}
	
	/**
	 * Method to perform subtraction operation for given arguments 
	 * @param num1 First number for subtraction
	 * @param num2 Second number for subtraction
	 * @return num1 - num2
	 */
	static double subtractMethod(double num1, double num2) {
		return num1 - num2;
	}
	
	/**
	 * Method to perform Multiplication operation for given arguments 
	 * @param num1 First number for Multiplication
	 * @param num2 Second number for Multiplication
	 * @return Multiplication of num1 and num2 -> num1 * num2
	 */
	static double multiplyMethod(double num1, double num2) {
		return num1 * num2;
	}
	
	/**
	 * Method to perform division operation for given arguments 
	 * @param num1 First number for division
	 * @param num2 Second number for division, value can not be 0
	 * @return division of num1 and num2 -> num1 / num2
	 */
	static double divisionMethod(double num1, double num2) {
		if (num2 == 0.0) {
			System.out.println("divider can not be zero");
			return 0;
		}
		else {
			return num1 / num2;	
		}
	}
}
