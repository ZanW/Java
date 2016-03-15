package chapter2;

//compare two input numbers stored number1 and number2 by equality and relational operators

import java.util.Scanner;


public class Comparison {
	
	public static void main(String[] args) {
		
		int number1, number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input the first number");
		number1 = input.nextInt();
		
		System.out.println("please input the second number");
		number2 = input.nextInt();
		
		if(number1 == number2) {
		System.out.printf("%d == %d\n", number1, number2);
		}
		
		if(number1 != number2) {
			System.out.printf("%d != %d\n", number1, number2);
		}
		
		if(number1 > number2) {
			System.out.printf("%d > %d\n", number1, number2);
		}
		
		if(number1 < number2) {
			System.out.printf("%d < %d\n", number1, number2);
		}
		
		if(number1 >= number2) {
			System.out.printf("%d >= %d\n", number1, number2);
		}
		
		
		if (number1 <= number2) {
			System.out.printf("%d <= %d\n", number1, number2);
		}
	}
}