package oops;

class counter {
	int count;
	
	public synchronized void increment() {
		count++;
	}
}

public class SyncronizedThread {

		
	public static void main(String[] args) throws InterruptedException {
		//  Auto-generated method stub
		counter c = new counter();
	
		Runnable r1 = () ->{
			for(int i=0; i<100; i++) {
				c.increment();
			}
		};
		
		
		Runnable r2 = () ->{
			for(int i=0; i<100; i++) {
				c.increment();
			}
		};
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(c.count);
	}

}
