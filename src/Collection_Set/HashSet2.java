package Collection_Set;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
HashSet HS=new HashSet();
		
		HS.add("Sampada");
		HS.add("Aditi");
		HS.add("Mike");
		HS.add("Prachi");
		HS.add("Dear");

		System.out.println(HS);
		
		HashSet<String> HS1=new HashSet<String>();
		
		HS1.addAll(HS);
		System.out.println(HS1);
		
		HS1.removeAll(HS);
		System.out.println(HS1);
		

	}

}
