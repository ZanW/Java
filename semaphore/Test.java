package semaphore;

import java.util.concurrent.Semaphore;

import javax.print.attribute.standard.RequestingUserName;
import javax.xml.stream.events.StartDocument;

public class Test {
	
	private static int[] someShareData = new int[10];
	
	private static Semaphore mutex = new Semaphore(1, true);
	private static Semaphore barrier = new Semaphore(-3, true);
	
	
	public static int[] getSomeSharedData() throws InterruptedException {
		mutex.acquire();
		int[] returnData = someShareData;
		mutex.release();
		return returnData;
    	}
	
	public static void writeSomeSharedData(int[] variable) throws InterruptedException {
		mutex.acquire();
		
		for (int i=0; i<10; i++) {
			someShareData[i] = variable[i];
			
		mutex.release();
		}
	}
	
	public static void realeaseBarrier() {
		barrier.release();
	}

	public static void main(String[] args) throws InterruptedException {
		
		for (int t = 0; t < 10; t++){
		 someShareData[t] = 1;
		}
		
		MultiplierThread T1 = new MultiplierThread("Multiplier Thread 1", 1);
		MultiplierThread T2 = new MultiplierThread("Multiplier Thread 2", 2);
		
		AdderThread T3 = new AdderThread(3, "Adder Thread 3");
		AdderThread T4 = new AdderThread(4, "Adder Thread 4");
		
		T1.start();
		T2.start();
		
		T3.start();
		T4.start();
		
		T1.join();
		T2.join();
		
		T3.join();
		T4.join();
		
		barrier.acquire();
		
		System.out.println("all threads have finished and now will do some additional works");
		
		for (int y = 0; y < 100; y++) {
			
		}
		
		
		
		
	}
	
	 
	 
	 
	
}
