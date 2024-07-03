package core.ClassObjectMethods;

public class vehicle1 {

	private  int id;
	private int capacity;
	private  String name;
	private static int fuelCap;
	private static int Kpl;
	
	public vehicle1(int id,int capacity,String name,int fuelCap,int Kpl) {
		 this.id=id;
		 this.capacity = capacity;
		 this.name = name;
		 this.fuelCap = fuelCap;
		 this.Kpl = Kpl;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stud
	
		
		vehicle1 minivan = new vehicle1(1,5,"minivan",50,10);
		carInfo(minivan.id,minivan.capacity,minivan.name,minivan.range(fuelCap,Kpl));
		
		vehicle1 Bus = new vehicle1(2,50,"Bus",100,25);
		carInfo(Bus.id,Bus.capacity,Bus.name,Bus.range(fuelCap,Kpl));
		
		vehicle1 motorCycle = new vehicle1(3,2,"motor-cycle",15,50);
		carInfo(motorCycle.id,motorCycle.capacity,motorCycle.name,motorCycle.range(fuelCap,Kpl));
		
	}

	public  int range(int fuelCap,int Kpl) {
		return fuelCap * Kpl;
		
	}
	public static  void carInfo(int id,int capacity,String name,int Vrange) {
		System.out.println();
		System.out.println("Vehicle : "+name.toUpperCase());
		System.out.println("Id : "+id);
		System.out.println("Capacity of person : "+capacity);
		System.out.println("Range of vehicle : "+Vrange);
		
		
	}


}
