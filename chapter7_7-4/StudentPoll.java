package chapter7_7$4;

import java.util.Random;

public class StudentPoll {
	
	public static void main(String[] args) {
	
	 int[] rateFre = new int[6];
	 int[] studentRate = new int[20];
	 Random rate = new Random();
	 
	 for (int i = 0; i < 20; i++) {
		 
		 studentRate[i] = rate.nextInt(5)+1;
	 
	 switch (studentRate[i]) {
	 
	 case 1: rateFre[1]++;
	 break;
	 case 2: rateFre[2]++;
	 break;
	 case 3: rateFre[3]++;
	 break;
	 case 4: rateFre[4]++;
	 break;
	 case 5: rateFre[5]++;
	 break;
	 }
	}
	 System.out.print("the rates of 20 studens are: ");
	 for (int j = 0; j < studentRate.length; j++) {
		 
		 System.out.printf("%d ", studentRate[j]);
	 }
	 System.out.println();
		
	 System.out.printf("%s%15s\n", "Scale", "Frequency");
	 
	 for (int k = 1; k < rateFre.length; k++) {
		 
		System.out.printf("%d%15d\n", k, rateFre[k]);
	 }
	 
	 
	}

	}