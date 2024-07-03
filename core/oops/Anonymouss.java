package oops;

abstract class abc{
	public abstract void printD();
}


public class Anonymouss {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abc a =new abc() {

			@Override
			public void printD() {
				// TODO Auto-generated method stub
				System.out.println("HEllO");
			}
			
		};
		
		
		a.printD();
	}

}
