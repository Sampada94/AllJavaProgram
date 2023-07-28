package Collection_Set;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		HashSet HS1 =new HashSet();
		
		HS1.add(2);
		HS1.add(5);
		HS1.add(9);
		HS1.add(40);
		HS1.add(20);
		
		System.out.println(HS1);  //only display unique element
		
	HashSet HS2 =new HashSet();
		
		HS2.add(21);
		HS2.add(51);
		HS2.add(91);
		HS2.add(41);
		HS2.add(2);
		
		System.out.println(HS2);
		
		//retainAll
		//only common element display
		
		HS1.retainAll(HS2); 
		System.out.println(HS1);  //2
		
		HS1.removeAll(HS2);
		System.out.println(HS1);
		

	}

}
