/*
 * Program to a specified number of generate fibonacci series. 
 * Read the required count from the keyboard 
 */
package org.apex.assignment;
import java.util.Scanner;

public class FibonacciTest {
	public static void main(String[] args) {
		int num;

		/* test comment to add */
		System.out.print("Enter the number: ");
		Scanner inputNumber = new Scanner(System.in);
		
		/* Check if user input is integer or not */
		if (inputNumber.hasNextInt()) {
			num = inputNumber.nextInt();
			FibonacciEx1.fiboSer(num);
		} else {
			System.out.println("Please Enter an integer");
		}
		inputNumber.close();
	}
}
