package org.apex.assignment;
//import java.util.Scanner;

/**
 * Class to test all method of BasicCalculator.java 
 */
public class BasicCalulatorTest {

	/* sample comment in calculater program */
	public static void main(String[] args) {
		//int num;

		//System.out.println("Please Enter the expression e.g. number1 <operator> number2 ");
		//System.out.println("e.g. number1 + number2  OR number1 - number2 OR number1 * number2 OR number1 / number2");
		///Scanner inputNumber = new Scanner(System.in);
		
		
		System.out.println(BasicCalulatorEx3.addMethod(5, 6));
		System.out.println(BasicCalulatorEx3.subtractMethod(4, 6));
		System.out.println(BasicCalulatorEx3.multiplyMethod(4, 7));
		System.out.println(BasicCalulatorEx3.divisionMethod(6, -1));
	}

}
