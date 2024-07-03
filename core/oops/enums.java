package oops;

enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}

public class enums {
	  public static void main(String[] args) { 
		  for(Level x: Level.values()) {
			  System.out.println(x);
		  }
		   
		  } 
}
