package oops;

// abstract class and abstract method
abstract class MyAbstract{
	
	protected int data;
	protected String str;
	
	MyAbstract(int data,String str){
		this.data = data;
		this.str= str;
		
	}
	abstract void printD();
}
class OopsDemo extends MyAbstract{
	
	OopsDemo(int data,String str){
	super(data,str);
	}
	
	@Override
	void printD() {
		System.out.println(data);
		System.out.println(str);
	}
	

}


public class Abstractt {
	public static void main(String[] args) {
		OopsDemo od=new OopsDemo(1,"test");
		od.printD();
		System.out.println("abstracttt class called");
	}
}