package oops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gmail1 = "sahilvadia7776@gmail.com";
		String gmail2 = "Sahilvadia@gmail.com";
		String gmail3 = "7776@gmail.com";
		String gmail4 = "sahilvadia@a.ea";
		String gmail5 = "sahilvadia7776gmail.com";
		
		
		
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(gmail4);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	}

}
