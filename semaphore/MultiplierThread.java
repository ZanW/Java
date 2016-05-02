package semaphore;

public class MultiplierThread extends Thread {
	
	private String threadName;
	private int threadID;
	
	public MultiplierThread(String name, int ID) {
		threadName = name;
		threadID = ID;
	}
	
	public void run() {
	
	int[] privateData = new int[10]; 
	
	try {
		privateData = Test.getSomeSharedData();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	for(int i=0; i<10; i++){
		privateData[i]*=2;
	}
	
	try {
		Test.writeSomeSharedData(privateData);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Test.realeaseBarrier();

	System.out.println("Thread " + threadName + "has finished calculations and writing and now doing some additional job");

	int j=100;
	int m=0;
	
	for (j = 100; j > 0; j--) {
		m+=1;
	}
	
	System.out.println(threadName + " finish " + m + " times additional work" );
	
	}
}


