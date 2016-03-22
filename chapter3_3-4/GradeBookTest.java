package chapter3_3$4;

import java.util.Scanner;

public class GradeBookTest {
	
	public static void main(String[] args) {
		
		String originalCourseName = new String();
		
		GradeBook myGradeBook = new GradeBook();
		
		originalCourseName = myGradeBook.getCourseName();
		
		System.out.println("original course name is "+originalCourseName);
		
		System.out.println("please type new course name");
		
		Scanner input = new Scanner(System.in);
		String newCourseName = input.nextLine();
		
		myGradeBook.setCourseName(newCourseName);
		
		myGradeBook.displayMessage();
		
		
	}
}
