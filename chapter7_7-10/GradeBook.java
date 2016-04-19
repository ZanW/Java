package chapter7_7$10;

public class GradeBook {
	
	private String courseName;
	private int[][] grade;
	
	public GradeBook(String name, int[][] array) {
		
		courseName = name;
		grade = array;
	}
	
	public String getName() {
		
		return courseName;
	}
	
	public void setName(String newName) {
		
		courseName = newName;
	}
	
	public void displayMessage() {
		
		System.out.printf("Welcome to the grade book for %s\n\n", getName());
	}
	
	public void GradeStatistics() {
		
		
		System.out.printf("\n\n%-11s :%5s%5s%5s%8s\n", "Student   #", "test1", "test2", "test3", "Average");
		
		
		for (int[] row : grade) {
			
			int sum = 0;
			
			System.out.printf("Student%4d :", row.length);
			
			for (int grade : row) {
				
				System.out.printf("%5d", grade);

		        sum += grade;			
			}
			  System.out.printf("%8.2f\n", (double)sum/row.length);  
		}
	}
		
	public void get_MinimumGrade() {

		int minimum = grade[0][0];

		for (int[] row : grade) {

			for (int val : row) {
				
				if (minimum > val) {
					minimum = val;
				}
			}

		}
		System.out.println("\nthe lowest grade is: " + minimum);
	}
	

	public void get_MaximumGrade() {

		int maximum = grade[0][0];

		for (int row = 0; row < grade.length; row++) {

			for (int val : grade[row]) {

				if (maximum < val) {
					maximum = val;
				}
			}

		}
		System.out.println("\nthe highest grade is: " + maximum);

	}
	
	public void barChart() {
		
		System.out.println("\nGrade Distribution: ");
		
		int[] frequency = new int[11];
		
		for (int row = 0; row < grade.length; row++) {

			for (int val : grade[row]) { 
				
				frequency[val/10]++;
			}
			
		}
			
		for (int count = 0; count < (frequency.length - 1); count++) {	
			
		
		System.out.printf("%2d - %2d:",count*10, count*10+9);
		
		       for(int star = 0; star < frequency[count]; star++)
		      System.out.print("*");
		       
		 System.out.print("\n");
		
		}
		
		if (frequency[10] != 0) {
			
			System.out.printf("%7d:",100);
			
			 for(int star = 0; star < frequency[10]; star++)
			      System.out.print("*");
			 
			 System.out.print("\n");
		} else {
			System.out.printf("%7d:",100);
		}
		
		}
	}
		
