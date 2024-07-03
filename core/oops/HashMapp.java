package oops;

import java.util.HashMap;

public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> capitalCities = new HashMap<String,String>();
		capitalCities.put("Gujarat","Gandhinagar");
		capitalCities.put("Bihar","patna");
		capitalCities.put("Assam","Dispur");
		capitalCities.put("Karnataka","Bengaluru");
		
			
		System.out.println(capitalCities);
		
		for(String i : capitalCities.values()) {
			System.out.println(i);
		}
		
		
		
		HashMap<String,Integer> capitalCitiesRank = new HashMap<String,Integer>();
		capitalCitiesRank.put("Gujarat",1);
		capitalCitiesRank.put("Bihar",2);
		capitalCitiesRank.put("Assam",3);
		capitalCitiesRank.put("Karnataka",4);
		
		
		System.out.println(capitalCitiesRank);
		
		
	}

}
