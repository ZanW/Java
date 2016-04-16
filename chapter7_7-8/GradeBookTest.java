package chapter7_7$8;

public class GradeBookTest {
	
	public static void main(String[] args) {
		
		String courseName = "CS101 Introduction to Programming";
		int[] gradeArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		GradeBook test = new GradeBook(courseName, gradeArray);
		
		test.displayMessage();
		test.processGrades();
		
	}

}
