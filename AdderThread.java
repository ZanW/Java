package semaphore;

public class AdderThread extends Thread {
	
	 private int threadID;
	 private String threadName;
	
	public AdderThread(int ID, String name) {
		threadID = ID;
		threadName = name;		
	}
	
	
	public void run() {
	
	int[] privateData = new int[10];
	
	try {
		privateData = Test.getSomeSharedData();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	for (int i = 0; i < 10; i++) {
		privateData[i]+=10;	
	}
	
	try {
		Test.writeSomeSharedData(privateData);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Test.realeaseBarrier();
	
	System.out.println("Thread " + threadName + "has finished calculations and writing and now doing some additional job");
  
	int j = 50;
	int n = 0;
 	for (j = 50; j > 0; j--){
 		n+=1;
 	}
	
 	System.out.println(threadName + " finish " + n + " times additional work" );
 	
	}
}
