package oops;


class encap{

	private String name;
	
	
//	encap(String name){
//		this.name = name;
//	}
	
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		return this.name=name;
	}
	
}

public class encapsulationn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		encap en = new encap();
		en.setName("encapsulation");
		System.out.println(en.getName());

	}

}

