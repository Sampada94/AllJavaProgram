package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet HS=new HashSet();
		
		//default capacity = 16 
		//load factor=0.75 & hetro
			
			HS.add("Java");
			HS.add("Python");
			HS.add(44.5);
			HS.add(true);
			HS.add('F');
			HS.add(100);
			HS.add(null);
			HS.add(null);
			
			System.out.println(HS);

			System.out.println(HS.size());
			
			// if ur trying to add duplicate element then it will returen false 
			System.out.println(HS.add(100));   //false 
			

			System.out.println(HS.add(50));  //true
			
			//remove
			HS.remove('F');
			System.out.println(HS);
			
		//Set & get are not present in hashSet

		// isEmpty
			
			System.out.println(HS.isEmpty());  //false
			
			//contains = checke the element present or not
			
			System.out.println(HS.contains(1));  //false
			System.out.println("************");
			//read element by for loop
		//	for(int i=0;i<HS.size();i++) {
		///		System.out.println(HS.get(i);
		//	}
			System.out.println("************");
			// read element by each for loop
			for(Object H1:HS) {
				System.out.println(H1);
			}
			
			System.out.println("************");
			//read element by iterator
			Iterator it=HS.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}

	}

}
