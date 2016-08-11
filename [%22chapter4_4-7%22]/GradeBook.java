package chapter4_4$7;

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	private double averGrade;
	
	public GradeBook(String courNam) {
		
		courseName = courNam;
	}
	
	public void setCourseName(String setName) {
		
		courseName = setName;
	
	}
	
	public String getCourseName() {
		
		return courseName;
	}
	
	public void averageGrade() {
		
		int i = 0;
		int grade = 0;
		int sumGrade = 0;
		int coutGrade = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input one grade or end by inputing -1");
		
		grade = input.nextInt();
		sumGrade = grade;
		while (true) {
			
			System.out.println("please input one grade or end by inputing -1");
			grade = input.nextInt();
			if (grade == -1) break;
			else {
				sumGrade += grade;
				coutGrade++;
			}
		}
		
		averGrade = (double)sumGrade/coutGrade;
		
		System.out.println("Total grade of "+coutGrade+" courses of "+courseName+" is "+sumGrade);
		System.out.println("Average of "+coutGrade+" courses "+courseName+" is "+averGrade);
		
	}
	
}