package chapter5_5$6;

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	private int gradeCout;
	private int grade;
	private int gradeSum;
	private double averGrade;
	private int coutA, coutB, coutC, coutD, coutF;
	
	public GradeBook(String CourNam) {
		
		courseName = CourNam;
		
	}
	
	public String getCourseName() {
		
		return courseName;
		
	}
	
	public void setCourseName(String setCourNam) {
		
		courseName = setCourNam;
	}
	
	public void displayMessage() {
		
		System.out.println(courseName);
		System.out.printf("%s %s", "the course name is ", getCourseName());
	}
	
 	public void inputGrade() {
		
		System.out.printf("%s\n%s\n", "please input grades (1-100)", "or please end inputing by pressing <Ctrl>z");
	
		Scanner input = new Scanner(System.in);
		
		System.out.println(input.hasNext());
		
		while(input.hasNext()) {
			
		System.out.println(input.hasNext());
			
			gradeCout++;
			grade = input.nextInt();
			gradeSum += grade;
			
			letterGradeCounter(grade);
			
		}
		
		if (gradeCout !=0) {
			
			averGrade = (double)gradeSum/gradeCout;
		}
		
	}
	
	public void gradeReport() {
	
		System.out.printf("%s\n", "Grade Report:");
		System.out.printf("%s%d\n", "Total Grade Sum is: ", gradeSum);
		System.out.printf("%s%.2f\n", "Average Grade is: ", averGrade);
		System.out.printf("%s\n", "Letter Grade Counter Division: ");
		System.out.printf("%s%d\n%s%d\n%s%d\n%s%d\n", "A: ", coutA, "B: ",coutB, "C: ", coutC, "F: ", coutF);
		
	}
		
		private void letterGradeCounter(int gra) {
			
			switch(gra/10)
			{
			case 1: 
			case 2: 
			case 3: 
			case 4: 
			case 5: 
				coutF++;
			    break;
			case 6: 
				coutD++;
				break;
			case 7: 
				coutC++;
				break;
			case 8: 
				coutB++;
				break;
			case 9: 
			case 10: 
				coutA++;
				break;
			default :
				System.out.println("please input valid grade");
				break;
					
			}
			
			
		} 
		
		
	}
	