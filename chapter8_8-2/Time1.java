package chapter8_8$2;

public class Time1 {
	
	
//	private int hour;
//	private int minute;
//	private int second;
	
	public void setTime(int h, int min, int sec ) {
		
		if ((h >= 0 && h < 24) && (min >= 0 && min < 60) && (sec >= 0 && sec < 60)) {
		
//		hour = h;
//		minute = min;
//		second = sec;		
	
		} else {
			throw new IllegalArgumentException("input time is out of range, please input again");
		}
		
	}
	
	public String universalTime(int hour, int minute, int second) {
			
	 return	String.format("Universal Time is : %02d : %02d : %02d" , hour, minute, second);
	}
	
	public String standardTime(int hour, int minute, int second) {
		
		
		String flag = ((hour >= 12) ? "PM" : "AM");
		int hr = (((hour == 12)||(hour == 0)) ? 12 : (hour%12));				
		
		return	String.format("Universal Time is : %d : %02d : %02d %s" , hr, minute, second, flag);
		
	}
	
}