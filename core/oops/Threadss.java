package oops;

class Cars extends Thread{
	public void run(){
		for(int i =0; i<100; i++) {
			System.out.println("Hello Cars");
		
		}
	}
}

class Cycle extends Thread{
	public void run(){
		for(int i =0; i<100; i++) {
			System.out.println("Hello Cycle");
		
		}
	}
}

public class Threadss {

	public static void main(String[] args) {

		Cars a=new Cars();
		Cycle b=new Cycle();
		a.start();
		b.start();
	}

}
