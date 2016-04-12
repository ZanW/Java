package chapter7_7$6;

public class EnhancedForTest {
	
	public static void main(String[] args) {
		
		int[] array = {100, 200, 300, 600, 500};
		int total = 0;
		
		for (int countNum : array) {
			System.out.printf("%d ", countNum);
			total += countNum;
			
		}
		
		System.out.println();
		
		System.out.printf("the sum of elements in array is: %d", total);
	}
	
	
}