package chapter6_6$9;

public class TestStaticAccess {
	
	private static int testVal = 10;
	
	public static void main(String[] args) {
		
		System.out.println("primitive testval =" + testVal);
		
	Invoking e = new Invoking();// static method can not directly invoke non-static method in the same class
		
	e.test1();
	
	System.out.println("testval =" + testVal);// one statement cannot be placed outside one method in the class
	
	}
		
		public void changeStaticValue() {
			
		testVal = 20;// whether non-static method can access and manipulate static variable 
		
	}
		
		
}

