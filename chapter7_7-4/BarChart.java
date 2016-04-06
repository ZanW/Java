package chapter7_7$4;

public class BarChart {
	
	public static void main(String[] args) {
	
	int[] grade = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
	int[] frequency = new int[11];
	final int GRADE_NUMBER = grade.length;
	//int cout0 = 0, cout1 = 0, cout2 = 0, cout3 = 0, cout4 = 0, cout5 = 0, cout6 = 0, cout7 = 0, cout8 = 0, cout9 = 0, cout10 = 0;
	
	for (int count = 0; count < GRADE_NUMBER; count++) {
		
	int indexFrequency = grade[count]/10;// index for array frequency
    
	System.out.println("indexFrequency = " + indexFrequency);
	
	switch (indexFrequency) {
    
    case 0: 
    	//cout0++;
    frequency[indexFrequency]++;
    break;
    case 1: 
    	//cout1++;
    	frequency[indexFrequency]++;
    break;
    case 2: 
    	//cout2++;
    	frequency[indexFrequency]++;
    break;
    case 3: 
    	//cout3++;
    	frequency[indexFrequency]++;
    break;
    case 4: 
    	//cout4++;
    	frequency[indexFrequency]++;
    break;
    case 5: 
    	//cout5++;
    	frequency[indexFrequency]++;
    break;
    case 6: 
    	//cout6++;
    	frequency[indexFrequency]++;
    break;
    case 7: 
    	//cout7++;
    	frequency[indexFrequency]++;
    break;
    case 8: 
    	//cout8++;
    	frequency[indexFrequency]++;
    break;
    case 9: 
    	//cout9++;
    	frequency[indexFrequency]++;
    break;
    case 10: 
    	//cout10++;
    	frequency[indexFrequency]++;
    break;
    default : System.out.println("please input a valid grade!");
    break;
     }   
    }
	
for (int count = 0; count < frequency.length; count++) {
		
		System.out.printf("frequency = %d ", frequency[count]);
		System.out.println();
	
	System.out.printf("%s%18s\n", "Grade Scale", "Student Number");
	
	
	}
	
	for (int count = 0; count < frequency.length; count++) {
		
		
		if (count == 0) {
		    System.out.printf("%d - %d: ", count, count*10+9);
		    for (int j = 0; j < frequency[count]; j++) {
		    	System.out.print("*");	
		    }    
		    System.out.println();
		    
		    } else if (count == 10) {
		    System.out.printf("%7d: ", 100);
		    for (int j = 0; j < frequency[10]; j++) {
		    	System.out.print("*");
		    }  System.out.println();
		    System.out.println();
		    } else { System.out.printf("%d - %d: ", count*10, count*10+9);
		    for (int j = 0; j < frequency[count]; j++) {
		    	System.out.print("*");
		    	} System.out.println();
		    }
		
	
			}    
    }
	
	
}