package chapter4_4$6;

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	private int averGrade;
	
	public GradeBook(String courNam) {
		
		courseName = courNam;
	}
	
	public void setCourseName(String setName) {
		
		courseName = setName;
	
	}
	
	public String getCourseName() {
		
		return courseName;
	}
	
	public int averageGrade() {
		
		int i = 0;
		int sumGrade = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		while (i < 10) {
			
			System.out.println("please input value No."+(i+1));
			
			
			
			sumGrade = sumGrade + input.nextInt();
			
			i++;
		}
		
		averGrade = sumGrade/10;
		
		return averGrade;
		
	}
	
}