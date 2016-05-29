package chapter7_7$13;

import java.util.Arrays;

public class ArrayManipulations {
	
	public static void main(String[] args) {
		
		double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
		System.out.print("Original doubleArray : ");
		for (double num : doubleArray) {
			
			System.out.printf("%.1f ", num);
		}
		System.out.println();
		// sort doubleArray in ascending order by default
	    Arrays.sort(doubleArray);
	    System.out.print("\ndoubleArray after sorted : ");
	    for (double val : doubleArray) {
	    	System.out.printf("%.1f ", val);
	    }
		System.out.println();
		
		//fill 10-element filledIntArray with 7s
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "filledIntArray");
		
		//copy array intArray to array intArrayCopy
		int[] intArray = {1, 2, 3, 4, 5, 6};
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");
		
		//compare array intArray and array intArrayCopy for equality
		boolean b1 = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("after comparing, intArray %s intArrayCopy\n\n", (b1? "==" : "!="));
		// another comparison
		boolean b2 = Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray %s filledIntArray\n\n", (b2? "==" : "!="));
		
		//search array for a certain value
		int index1 = Arrays.binarySearch(intArray, 5);
		if (index1 >= 0) {
			System.out.println("the location of value 5 in array intArray is " + index1);
		} else {
			System.out.println("the location of value 5 is not found");
		}
		
		int index2 = Arrays.binarySearch(intArray, 1);
		if (index2 >= 0) {
			System.out.println("the location of value 1 in array intArray is " + index2);
		} else {
			System.out.println("the location of value 1 is not found");
		}
		
		
	}
	
	private static void displayArray(int[] array, String arrayName) {
		
		System.out.print(arrayName + " : ");
		
		for (int elem : array) {
			
			System.out.printf("%s ", elem);
		}
		
		System.out.println();
	}
	
}