/*
 * Define an array with 10 integers and print all the elements with its index number.
 */

package org.apex.assignment;
import java.util.Random;

public class ArrayExerciseEx6 {

	public static void main(String[] args) {
		
		/*int[] aryList = new int[10];
		Random ranNum = new Random();
		for (int i = 0; i < aryList.length; i++) {
			aryList[i] = ranNum.nextInt(100);
			System.out.printf("Index %d : %d\n", i, aryList[i]);
			//System.out.println("Index " + i + " : " + aryList[i]);
		}*/
		
		//For Each example
		int aryList[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int ind = 0;
		for (int ary : aryList) {			
			System.out.printf("Index %d : %d \n", ind, ary);
			ind++;
		}
	}

}
