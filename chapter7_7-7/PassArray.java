package chapter7_7$7;

public class PassArray {
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		//modify entire array
		
		System.out.println("the array before being modified is: ");
		for (int number : array) {
			System.out.printf("%d ", number);
		}
		System.out.println();
		
		modifyEntireArray (array);
		
		//modify array element
		System.out.println("the element array[4] valued '" + array[4] +"' before being modified");
		
		modifyArrayElement (array[4]);	
		
		System.out.println("\nthe element array[4] valued '" + array[4] +"' after being modified");
		
	}
	
		public static void modifyEntireArray (int[] testArray) {
			
			for(int i = 0; i < testArray.length; i++) {
				
				testArray[i]*=2;
				
			}
			
			System.out.println("the array after being modified is: ");
			for (int count : testArray) {
				
				System.out.printf("%d ", count);
			}
			
			System.out.println();
 			
		}
		
		public static void modifyArrayElement (int arrayVal) {
			
			arrayVal*=2;
			
			System.out.println("arrayVal becomes '" + arrayVal + "' after being modified in this mehtod");
			System.out.println();
		}
	
}
