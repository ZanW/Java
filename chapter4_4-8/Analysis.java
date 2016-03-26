package chapter4_4$8;

import java.util.Scanner;

public class Analysis {
	
	public static void main(String[] args)  {
		
		int i = 0;
		int coutPass = 0;
		int coutFail = 0;
		Scanner input = new Scanner(System.in);
	
	while (i < 10) { 	
	
		i++;
	System.out.println("please enter result"+i+" :");	
	
	int Result = input.nextInt();
	
	if (Result == 1)
		coutPass++;
	else coutFail++;
	
	}
	
	System.out.println("there are "+coutPass+" students pass the exam");
	System.out.println("there are "+coutFail+" students fail the exam");
	
	if (coutPass >= 8)
		System.out.println("bonus to instructor!");
	
	}
	
	
}
