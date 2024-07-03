package oops;


class interf  implements Interfacee{
	 public void animalSound() {
		    // The body of animalSound() is provided here
		    System.out.println("The says: Ahee Ahee");
		  }
		 
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("The run: tuk duk");
		}

		@Override
		public void name(String name) {
			// TODO Auto-generated method stub
			System.out.println("Animal :"+name);
		}

		
}
public class InterfaceDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interf i = new interf();
		i.name("horse	");
		i.animalSound();
		i.run();

	}

}
