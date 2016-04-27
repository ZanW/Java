package locksAndConditions;

public class ATMThread extends Thread {
	
	public void run(){
	
		for (int i = 3; i > 0; i--) {
			
			Main.addToBalance(10);
			
		}
			
	
	}

}
