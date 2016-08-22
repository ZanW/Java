package chapter7_7$14;

import java.util.ArrayList;

public class ArraylistCollection {
	
	public static void main(String[] args) {
		
		ArrayList<String> items = new ArrayList<>();
		
		items.add("red");
		for (String count : items) {
			System.out.printf("%s ", count);			
		}
		
		System.out.println();
		
		items.add(0, "yellow");
		for (String count : items) {
			System.out.printf("%s ", count);
		}
		
		System.out.println();
		
		items.add("green");
		items.add("yellow");
		display(items);
		
		
		items.remove(0); //remove "red" from the ArrayList
		items.remove("green"); //remove "green" from the ArrayList
		display(items);
		
		System.out.println("the element indexed 0 is " + items.get(0)); //get the element indexed 0

		System.out.printf("Size of the ArrayList is %s\n", items.size());

		System.out.printf("the color blue is %s in the ArrayList", items.contains("blue") ? "" : "not");

	}

		private static void display(ArrayList<String> array) {
			
			System.out.print("current ArrayList is: ");
			
			for (String elem : array) {
				System.out.printf("%s ", elem);
			}
			
			System.out.print("\n");
			
		}
}

