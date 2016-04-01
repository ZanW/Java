package chapter6_6$11;

public class MethodOverload {
	
	public static void main(String[] args) {
		
		squireDouble(7.5);
		squireInt(7);
		
	}
	
	private static void squireDouble(double seedVal) {
		
		System.out.println("the squireDouble method is invoked, the value "+seedVal+" is accepted");
		
		System.out.printf("the result of squireDouble is: %.2f\n", seedVal*seedVal);
		
	}
	
	private static void squireInt(int seedVal) {
		
		System.out.println("the squireInt method is invoked, the value "+seedVal+" is accepted");
		
		System.out.printf("the result of squireInt is: %d", seedVal*seedVal);
		
	}
	
}