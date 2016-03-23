package chapter3_3$6;

public class GradeBookTest {
	
	public static void main(String[] args) {
	
	GradeBook myGradeBook1 = new GradeBook("SEON 341");
	GradeBook myGradeBook2 = new GradeBook("Comp 5541");
	
	
	System.out.println("let us see the 'getCourseName' method");
	System.out.printf("%s is %s\n", "getCourseName", myGradeBook1.getCourseName());
	System.out.printf("%s is %s\n", "getCourseName", myGradeBook2.getCourseName());
	
	System.out.println();
	
	System.out.println("let us see the 'displayMessage' method");
	myGradeBook1.displayMessage();
	myGradeBook2.displayMessage();
	
	}
	
}

