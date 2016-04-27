package locksAndConditions;

import java.util.concurrent.locks.*;

public class Main {
	
	private static Lock lock = new ReentrantLock(true);
	
	public static int accountBalance;
	
	public static void addToBalance(int balanceDifference) {
		
		boolean executing = false;
		
		executing = lock.tryLock();
		
		if(executing) {
		
		accountBalance+=balanceDifference; 
		
		lock.unlock();
		
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
	System.out.println("prmitive account balance is " + accountBalance);
	
	ATMThread T1 = new ATMThread();
	ATMThread T2 = new ATMThread();
	ATMThread T3 = new ATMThread();
	
	T1.start();
	T2.start();
	T3.start();
	
	T1.join();
	T2.join();
	T3.join();
	
	System.out.println("Final Account Sum is " + accountBalance);
	
	}

}
