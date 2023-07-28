package Collection_Set;

import java.util.LinkedHashSet;

public class LinkedhashSet1 {

	public static void main(String[] args) {
	
		LinkedHashSet LHS=new LinkedHashSet();
		
		// same method present which is present in hashset class
		// Default capacity =16 
		// Load factor=0.75
		//Duplicate element are not allowed
		//Insertion order is preserve
		//null value accept only once
		
		LHS.add("Welcome");
		LHS.add(100);
		LHS.add("JAva");
		LHS.add(null);
		LHS.add(true);
		LHS.add(null);
		
		System.out.println(LHS);	
		
		LHS.add(200);
		System.out.println(LHS);
				
				
				

	}

}
