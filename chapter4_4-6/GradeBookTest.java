package chapter4_4$6;

public class GradeBookTest {
	
	public static void main(String[] args) {
		
		GradeBook myGradeBook = new GradeBook("Comp 5461");	
		
		System.out.printf("%s %s\n%s %d","Course name is ", myGradeBook.getCourseName(), "Average Grade of ten courses are ", myGradeBook.averageGrade());
		
	}
}