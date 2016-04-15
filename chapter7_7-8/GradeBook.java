package  chapter7_7$8;

public class GradeBook {
	
	private String course;
	private int[] gradeArr;// instance variable does not need to be initialized here. Its default value is null 
	
//	public static void main(String[] args) {
//		
//		double[] sex = new double[3];
//		
//		System.out.println("gradeArr = "+gradeArr+"\n"+"sex = "+sex);
//		
//		for(double value : sex) {
//			
//			System.out.println(value);
//			
//		}
//	}
//	
	public GradeBook (String courseName, int[] gradeArray) {
		
		course = courseName;
		gradeArr = gradeArray;
				
	}
	
	public void displayMessage () {
		
		System.out.println("Welcome to the grade book for\n" + course);
	}
	
	public void processGrades () {
		
		System.out.println("\n\nThe grades are: \n");
		
		for (int count = 0; count < gradeArr.length; count++)
		System.out.printf("Student %d : %3d\n", count+1, gradeArr[count]);
		
		averageGrade();
		lowestGrade();
		highestGrade();
		barChart();
	}
	
	public void averageGrade() {
		int sum = 0;
		for (int val : gradeArr)
			sum+=val;
		System.out.println("\n\nthe total grade is: " + sum);
		System.out.printf("\nthe average grade is: %.2f", (double)sum/gradeArr.length);
		
	}
	
	public void lowestGrade() {
		
		int lowest = gradeArr[0];
		
		for (int val : gradeArr) {
			
			if (lowest > val) {
				lowest = val;
			}
			
		}
		
		System.out.println("\n\nthe lowest grade is: " + lowest);
	}
	
	public void highestGrade() {
		
		int highest = 0;
		
		for (int val : gradeArr) {
			
			if (highest < val) {
				highest = val;
			}
			
		}
		
		System.out.println("\n\nthe highest grade is: " + highest);
	}
	
	public void barChart() {
		
		int[] frequency = new int[11];
		
		for (int val : gradeArr) {
			
			frequency[val/10]++;
		}
		
		for (int i = 0; i < 11; i++) {
			
			if (i != 10) {
			System.out.printf("\n%d - %d : ", i*10, i*10+9);
			for (int j = 1 ; j <= frequency[i]; j++) {
				System.out.print("*");
			  }
			}
		
		if (i == 10) {
			
			System.out.printf("\n%7d : ", 100);
			for (int j = 1 ; j <= frequency[i]; j++) {
				System.out.print("*");
		}
	}
	
		}
	
}}