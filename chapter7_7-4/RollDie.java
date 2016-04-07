package chapter7_7$4;

import java.util.Random;

public class RollDie {

	public static void main(String[] args) {
		
		int[] dieFace = new int[7];
		Random roll = new Random();
		
		for (int i = 0; i < 600000; i++) {
			
			int face = roll.nextInt(6) + 1;// output is up to, but does not include 6
			
			dieFace[face]++;
		}
		
		System.out.printf("%s%15s\n", "Face", "Frequency");
		
		for (int j = 1; j < dieFace.length; j++) {
		System.out.printf("%4d%15d\n", j, dieFace[j]);
		}
	}
	
}
