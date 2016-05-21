
public class MultipleThreads extends Thread {

	System.out.println("ID");
	System.out.println("name");
	System.out.println("state");
	
}

Public static void main(String args[])
{
	 for (int i=0; i<15£» i++)
	 {
		 MultipleThreads t = new MultipleThreads();
		 
		 t.start();
	 }
}