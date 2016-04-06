package chapter7_7$4;
// initialize two arrays

public class InitArray {
	
	public static void main(String[] args) {
	// initialized an array with specified length
		int[] a = new int[10];
		
		System.out.printf("%s%40s\n", "The Index of the element","The Value in corresponding element");
		
		for (int count = 0; count < a.length; count++) {
			
			System.out.printf("%d%40d\n", count, a[count]);
			
		}
		
		System.out.printf("length of a == %s\n\n", a.length);
		
		
		
	// initialized an array with array initializer	
		int[] b = {4, 6, 5, 6, 7, 7, 2, 3, 9, 10};
		
		System.out.printf("%s%40s\n", "The Index of the element","The Value in corresponding element");
		
	for (int count = 0; count < b.length; count++) {
			
			System.out.printf("%d%40d\n", count, b[count]);
			
		}
	
	System.out.printf("length of b == %s\n\n", b.length);
		
		
	// calculating values to be placed into the elements of an array
	final int ARRAY_LENGTH = 10;
	int[] c = new int[ARRAY_LENGTH];
	
	System.out.printf("%s%40s\n", "The Index of the element","The Value in corresponding element");
	
	for (int count = 0; count < ARRAY_LENGTH; count++) {
		
		c[count] = count*2 + 2;
		System.out.printf("%d%40d\n", count, c[count]);
	}
	
	
	System.out.printf("length of c == %s\n\n", c.length);
	
	
	// summing the elements of an array
	
	int[] d = {1, 2, 8, 9};
	int sum = 0;
	for (int count = 0; count < d.length; count++) {
		sum += d[count];
	}
	System.out.printf("%s = %d", "the sum of the Elements of the array d = ", sum);
	
	}
	
}
