package oops;

class A extends Thread{
	public void run(){
		for(int i =0; i<100; i++) {
			System.out.println("Hello A");
		
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i =0; i<100; i++) {
			System.out.println("Hello B");
		
		}
	}
}

public class Threadss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		B b=new B();
		
		a.start();
		b.start();
	}

}
