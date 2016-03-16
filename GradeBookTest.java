package chapter3_3$3;

import java.util.Scanner;

public class GradeBookTest {
	
	public static void main(String[] args) {
	
	GradeBook display = new GradeBook();
	String nameOfCourse = new String();
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	
	System.out.println("please input the course name");
	
	nameOfCourse = input.nextLine();
	
	display.displayMessage(nameOfCourse);

	
    }// end main
}// end class GradeBookTest
