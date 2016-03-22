package chapter3_3$4;

public class GradeBook {
	
	private  String courseName;
	
	public  void setCourseName(String name) {
		
		courseName = name;
	}
	
	public  String getCourseName() {
		return courseName;
	}
	
	public  void displayMessage() {
		
		System.out.printf("Welcome to course %s\n", courseName);
		
		System.out.printf("Welcome to course(test) %s\n", getCourseName());
	}
}// end class