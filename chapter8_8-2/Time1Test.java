package chapter8_8$2;

import java.util.Scanner;

public class Time1Test {
	
	public static void main(String[] args) {
		
		int hour, minute, second;
		
		Time1 test = new Time1();
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input hour");
		hour = input.nextInt();
		System.out.println("please input minute");
		minute = input.nextInt();
		System.out.println("please input second");
		second = input.nextInt();
		
		try {
		test.setTime(hour, minute, second);}
		catch (IllegalArgumentException e) {
			System.out.printf("%s\n", e.getMessage());
			System.exit(0);
		}
		
		
		System.out.printf("The initial universal time is: %s\n", test.universalTime(0, 0, 0));
		System.out.printf("The initial standard time is: %s\n", test.standardTime(0 , 0 , 0));
		
		System.out.printf("Universal time after setTime is: %s\n", test.universalTime(hour, minute, second));
		System.out.printf("Standard time after setTime is: %s\n", test.standardTime(hour, minute, second));
		
		
		
	}
	
}
