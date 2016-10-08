package chapter4_4$7;

public class GradeBookTest {
	
	public static void main(String[] args) {
		
		GradeBook myGradeBook = new GradeBook("Comp 5461");	
		
		
		System.out.println("course name is "+myGradeBook.getCourseName());
		myGradeBook.averageGrade();
		
	}
}