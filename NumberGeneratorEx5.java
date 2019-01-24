/*
* Generate following:
•	Generate 1000 numbers
•	Generate multiple of 5 and less than 1000
•	Generate odd numbers up to 1000
 */
package org.apex.assignment;

class NumberGeneratorEx5 {

	// static void randomNumGen (int number) {
	// int b = 0;
	// Random randomNum = new Random();
	// for (int i = 0; i < number; i++) {
	// System.out.printf("%d ", randomNum.nextInt(100));
	// b=i;
	// }
	// System.out.println(); System.out.println(b);
	// }

	/**
	 * Method to generate n(argument) numbers 
	 */
	static void numberGen(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.printf("%d ", i);
			if (i % 30 == 0)
				System.out.println();
		}
	}

	/**
	 * Method to generate multiple of five which is less than n(argument)
	 */
	static void tableOfFive(int n) {
		for (int i = 1; i < n; i++) {
			System.out.printf((i % 5 == 0 ? i + " " : ""));
			if (i % 100 == 0)
				System.out.println();
		}
	}

	/**
	 * Method to generate odd numbers up to n(argument) numbers
	 */
	static void oddNumberGen(int n) {
		for (int i = 1; i < n; i++) {
			System.out.printf((i % 2 == 0 ? "" : i + " "));
			if (i % 50 == 0)
				System.out.println();
		}
	}

	public static void main(String[] args) {

		// randomNumGen(1000);
		// numberGen(1000);
		// tableOfFive(1000);
		oddNumberGen(1000);

	}

}
