package chapter7_7$12;

public class CommandLineArgument {
	
	public static void main(String[] args) {
		
		
		
		if(args.length != 3) {
			
			System.out.println("please input 3 values for new array's length, initial value and increment!");
		} else {
		
		
		int array_Length = Integer.parseInt(args[0]);
		int array_intial = Integer.parseInt(args[1]);
		int array_increment = Integer.parseInt(args[2]);
		int[] array = new int[array_Length];
		
		System.out.printf("%2s%2s%2s\n\n", array_Length, array_intial, array_increment);

		System.out.printf("%s\n%s %s\n", "values in array:", "Index", "Value");

		for (int count = 0; count < array.length; count++) {

			array[count] = (array_intial + count * array_increment);

			System.out.printf("%5d %5d\n", count, array[count]);
		}
		
		
		}
	}

}
