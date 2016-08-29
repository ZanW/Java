package chapter8_8$4;

import java.util.Scanner;

public class ThisTest {
	
	private static int hr;
	private static int min;
	private static int sec;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		SimpleTime test = new SimpleTime();
		
		System.out.println("please input hour, minute and second and isolates each value by enter");
		hr = input.nextInt();
		System.out.print("\n");
		min = input.nextInt();
		System.out.print("\n");
		sec = input.nextInt();
		System.out.print("\n");
		
		
		try {
		System.out.println("toUniversalString(): " + test.toUniversalString(hr, min, sec));
		System.out.println("this.toUniversalString(): " + test.timeFormate());
		} catch(IllegalArgumentException e ) {
			
			System.out.println(e.getMessage());
		}
		
		}
		
	
}


	class SimpleTime {
		
		private int hour;
		private int second;
		private int minute;
		
		public String toUniversalString(int hour, int minute, int second) {
			
			this.hour = hour;
			this.minute = minute;
			this.second = second;
			
			if ((this.hour>=0 && this.hour <= 23) 
					&& (this.minute >= 0 && this.minute <= 59) 
					&& (this.second >= 0 && this.second <= 59)){
				
			} else throw new IllegalArgumentException( "invalid time formate, please input the time again" );
			
			return String.format("%02d : %02d : %02d", this.hour, this.minute, this.second);
		}
		
		public String timeFormate() {
				
			return String.format("this.toUniversalString(): %s", this.toUniversalString(this.hour, this.minute, this.second));
			
		}
		
		
	}