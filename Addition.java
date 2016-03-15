package chapter2;

// obtain the sum of three numbers

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.printf("%s\n", "please input the first number: ");
		firstNumber = input.nextInt();

		System.out.printf("%s\n", "please input the second number: ");
		secondNumber = input.nextInt();

		System.out.printf("%s\n", "please input the third number: ");
		thirdNumber = input.nextInt();

		sum = firstNumber + secondNumber + thirdNumber;

		System.out.println("the sum of the three numbers is " + sum);
		
	}
	
}
