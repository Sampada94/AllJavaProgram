package CollectionList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
		LinkedList LL=new LinkedList();
		
		LL.add("S");
		LL.add("A");
		LL.add("M");
		LL.add("P");
		LL.add("D");
		
		System.out.println(LL);
		
		System.out.println("********");
		
		LinkedList<String>LL1= new LinkedList<String>();
		
		LL1.addAll(LL);
		System.out.println(LL1);
		
		//removeAll
		LL1.removeAll(LL);
		System.out.println(LL1);
		
		//collections
		System.out.println("Before sorting");
		Collections.sort(LL);
		System.out.println(LL);
		
		//reverse
		System.out.println("********");
		
		Collections.sort(LL,Collections.reverseOrder());
		System.out.println(LL);

	}

}
