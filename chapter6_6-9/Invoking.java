package chapter6_6$9;

public class Invoking {
	
	public void test1() {
		
		test2();// check non-static method test1 invoking non-static method test2 directly in the same class
	}
	
	public void test2() {
		
		TestStaticAccess test3 = new TestStaticAccess();
		
		test3.changeStaticValue();
		
	}

}
