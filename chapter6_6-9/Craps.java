package chapter6_6$9;

import java.util.Random;

public class Craps {
	
	private static Random roll = new Random();
	private enum Status { WIN, LOST, CONTINUE };
	private static int sumDice1;
	
	public static void main(String[] args) {
		
		Status gameStatus;
		int sumDice2;
		
		sumDice1 = rollDice();
				
		System.out.println("you roll the die with points:" + "sumDice1="+sumDice1);
		
		switch (sumDice1) {

		case 7:
		case 11: gameStatus = Status.WIN;
		System.out.println("you win the game without continuation:" + "sumDice1="+sumDice1);
		break;
		case 2:
		case 3:
		case 12: gameStatus = Status.LOST;
		System.out.println("you lost the game without continuation:" + "sumDice1="+sumDice1);
		break;
		default : gameStatus = Status.CONTINUE;
		System.out.println("you need to continue rolling the dies");
		break;	
		}
		
		while (gameStatus == Status.CONTINUE) {
			
			sumDice2 = rollDice();
			System.out.println("test sumDice2: "+sumDice2);
			
			if (sumDice1 == sumDice2) {
				System.out.println("you win the game:" + "sumDice1="+sumDice1+" sumDice2="+sumDice2);
				gameStatus = Status.WIN;
			} else if (sumDice2 == 7) {
				System.out.println("you Lost the game:" + "sumDice1="+sumDice1+" sumDice2="+sumDice2);
				gameStatus = Status.LOST;
			} else {
				System.out.println("roll die again!");
			}
			
		}
		
		
		
		
		
	}
	
	public static int rollDice() {
		
		int upwardFace1 = 1+roll.nextInt(6);
		int upwardFace2 = 1+roll.nextInt(6);
		
		int sumUpwardFace = upwardFace1 + upwardFace2;
		
		return sumUpwardFace;
	}
	
}

	