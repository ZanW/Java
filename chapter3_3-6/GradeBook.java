package chapter3_3$6;

public class GradeBook {
	
	private String courseName;
	
      public GradeBook(String courNam) {
    	  
    	  courseName = courNam;
    	  
      }
      
      public String getCourseName() {
    	  
    	  return courseName;
      }
      
      
      public void setCourseName(String setName) {
    	  
    	  courseName = setName;
    	  
      }
      
      
      public void displayMessage() {
    	  
    	  System.out.printf("%s %s\n", "Welcome to course", courseName);
      }
	
}

