package chapter7_7$11;

public class Variable_Length_Argument_Test {
	
	public static void main(String[] args) {
		
		double a = 10;
		double b = 20;
		double c = 30;
		double d = 40;
		
		System.out.printf("a = %.1f\nb = %.1f\nc = %.1f\nd = %.1f\n\n", a, b, c, d);
		
		System.out.printf("%s %.1f\n", "Average of a and b is", average(a, b));
		System.out.printf("%s %.1f\n", "Average of a, b and c is", average(a, b, c));
		System.out.printf("%s %.1f\n","Average of a, b, c and d is", average(a, b));
		
	}
	
	public static double average(double...numbers) {
	
		double sum = 0;
		
		for (double val : numbers) {
			
			sum += val;
		}
		
		return sum/numbers.length;
	}

}
