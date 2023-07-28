package CollectionList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList LL=new LinkedList();
		
		//1. add element
		LL.add("Sampada");
		LL.add("Welcome");
		LL.add("Null");
		LL.add("True");
		LL.add("NULL");
		LL.add("44");
		LL.add("Hello");
		LL.add("100");
		
		System.out.println(LL);
		
		//2. size
		System.out.println(LL.size());
		
		//3. remove
		LL.remove("Null");
		System.out.println(LL);
		
		LL.add("800");
		
		LL.add(2,"A");
		System.out.println(LL);
		
		//Get = retun the element at the specified postion
		System.out.println(LL.get(4));
//		System.out.println(LL.get(33));  // Index of bound exception
		
		//get first element
		System.out.println("First Element :"+LL.getFirst());
		
		//Get last element
		System.out.println("Last Element :"+LL.getLast());
		
		//isEmpty
		System.out.println(LL.isEmpty()); //false
		
		// Contains
		//Return true if contains present
		System.out.println(LL.contains("Sampada"));
		System.out.println(LL.contains("AAA"));
		System.out.println(LL.contains(true));
		
		// Reading element by for loop
		System.out.println("*************");
		System.out.println("Reading element by for loop");
		for(int i=0;i<LL.size();i++) {
			System.out.println(LL.get(i));
		}
		// Reading elements by each for loop
		System.out.println("********************");
		System.out.println("Reading element by each for loop");
		for(Object A1:LL) {
			System.out.println(A1);
		}
		
		// Reading elements by iterator
				System.out.println("********************");
				System.out.println("Reading element by iterator");
				Iterator it = LL.iterator();
				
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				
		
		
	
		

		
	}

}
