package chapter7_7$9;

public class InitMultiArray {
	
	public static void main(String[] args) {
	
	int[][] a = {{1, 2, 3},{4, 5, 6}};
	int[][] b = {{1, 2},{3},{4, 5, 6}};
	
	System.out.println("Values in multidimentional array a are:");
	
	for (int row = 0; row < a.length; row++ ) {
		
		for (int column = 0; column < a[row].length; column++) {
			
			System.out.printf("%2d ", a[row][column]);
			
		}
		
		System.out.println();			
			
	}
	
	System.out.println("Values in multidimentional array b are:");
	
	for (int row = 0; row < b.length; row++ ) {
		
		for (int column = 0; column < b[row].length; column++) {
			
			System.out.printf("%2d ", b[row][column]);
			
		}
		
		System.out.println();			
	
	
 }
	
}
}