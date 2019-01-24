/*
 * Program to a specified number of generate fibonacci series.
 */
package org.apex.assignment;

public class FibonacciEx1 {

	/**
	 * This method is used to generate fibonacci series for specified number
	 * 
	 * @param n This is user provided number to generate fibonacci series
	 */
	static void fiboSer(int n) {
		int sum = 0;

		/* if n is 0 than print 0 and return */
		if (n == 0)
			System.out.println(sum);

		else {
			int i = 0;
			int j = 1;

			/* print sum for 0th element */
			System.out.println(sum);

			/* iterate over all the numbers to calculate the sum */
			for (int count = 0; count < n; count++) {

				/* print sum of 1st element */
				if (count == 1)
					System.out.println(count);
				else {
					sum = i + j;
					System.out.println(sum);
					i = j;
					j = sum;
				}
			}
		}
	}
}
