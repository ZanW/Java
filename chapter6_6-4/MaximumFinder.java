package chapter6_6$4;

import java.util.Scanner;

public class MaximumFinder {
	
	public static void main(String[] args) {
		
		double value1, value2, value3;
		double maximum1,maximum2,maximum3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input the three values: ");
		value1 = input.nextDouble();
		
		value2 = input.nextDouble();
	
		value3 = input.nextDouble();
		
		MaximumFinder test = new MaximumFinder();
		
		maximum1 = test.maximumValue(value1, value2, value3);
		
		maximum2 = test.test(value1, value2, value3);
		
		maximum3 = test.maximumTest(value1, value2, value3);
		System.out.printf("%s %.2f\n%s %.2f\n%s %.2f", "the maximum value of group1 is", maximum1, "the maximum value of group2 is", maximum2, "the maximum value of group3 is", maximum3);
		
	}
		
	// method test is not type static, however invoke method maximumValue in the same class directly
		private double test(double u, double v, double w) {
			
			return maximumValue(u, v, w);
			
		}
	
		private double maximumValue(double val1, double val2, double val3) {
			
			double max = val1;
			
			if (max < val2) {
				
				max = val2;
			}
			
			if (max < val3) {
				
				max = val3;
			}
			
			return max;
			
		}
		
		public double maximumTest(double x, double y, double z) {
			
		 double testResult = Math.max(x, Math.max(y, z));
		 
		 return testResult;
		}
		
	}
	
