package core.encapsulation;

class GSDemo{
	private String name;
	
	   // Getter
	   public String getName() {
	     return name;
	   }

	   // Setter
	   public void setName(String newName) {
	     this.name = newName;
	   }
}
public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSDemo gs= new GSDemo();
		gs.setName("sahil");
		System.out.println(gs.getName());
	}

}
