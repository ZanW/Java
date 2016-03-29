package chapter6_6$8;

import java.util.Random;

public class RollDice {
	
	static int cout1, cout2, cout3, cout4, cout5, cout6;
	
	public static void main(String[] args) {

		Random roll = new Random();
		
		int face;
		
		for (int i = 0; i < 60000000; i++) {
			
			face = roll.nextInt(6) + 1;
			faceCout(face);
			
		}
		
		System.out.println("Count report of each face of the dice:");
		System.out.printf("%s      %d\n", "Count of Face 1", cout1);
		System.out.printf("%s      %d\n", "Count of Face 2", cout2);
		System.out.printf("%s      %d\n", "Count of Face 3", cout3);
		System.out.printf("%s      %d\n", "Count of Face 4", cout4);
		System.out.printf("%s      %d\n", "Count of Face 5", cout5);
		System.out.printf("%s      %d\n", "Count of Face 6", cout6);
		
	}
	
	
	private static void faceCout (int faceRecev) {
		
		
		switch (faceRecev) {
		case 1: cout1++;
		break;
		case 2: cout2++;
		break;	
		case 3: cout3++;
		break;
		case 4: cout4++;
		break;
		case 5: cout5++;
		break;
		case 6: cout6++;
		break;
		default:
			System.out.println("coding error, pleae check your code!");
			break;
		}
		
	}
	
	
}