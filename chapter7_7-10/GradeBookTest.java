package chapter7_7$10;

public class GradeBookTest {
	
	public static void main(String[] args) {
		
		int[][] grade ={{87,96,70},
				        {68,87,90},
				        {94,100,90},
				        {100,81,82},
				        {83,65,85},
				        {78,87,65},
				        {85,75,83},
				        {91,94,100},
				        {76,72,84},
				        {87,93,73}};
		
		GradeBook test = new GradeBook("CS 101", grade);
		
		test.displayMessage();
		test.get_MaximumGrade();
		test.get_MinimumGrade();
		test.GradeStatistics();
		test.barChart();
		
		
	}

}
