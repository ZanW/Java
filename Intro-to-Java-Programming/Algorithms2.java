
public class Algorithms2 
{
	public static void main(String[] args)
	{
		int item1 = 1, item2 = 10;
		int cost = 0;
		double tax1 = item1*0.08, tax2 = item2*0.08;
		double tip1 = item1*0.18, tip2 = item2*0.18;
		double cost1 = cost+item1+tax1+tip1, cost2= cost+item2+tax2+tip2;
		
		System.out.println(cost1);
	    System.out.println(cost2);
	
	}

}
