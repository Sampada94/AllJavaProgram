package CollectionList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {

	public static void main(String[] args) {
	
		ArrayList AL=new ArrayList();
		
		AL.add("S");
		AL.add("A");
		AL.add("M");
		AL.add("p");
		AL.add("D");
		AL.add("G");
	
		System.out.println(AL);
		
		// duplicate
		ArrayList duplicate = new ArrayList();
		duplicate.addAll(AL);
		System.out.println(duplicate);
		

		// removeall
		duplicate.removeAll(AL);
		System.out.println(duplicate);
		
		//collections
		Collections.sort(AL);
		System.out.println(AL);
		
		//reverseOrder
		
		Collections.sort(AL,Collections.reverseOrder());
		System.out.println(AL);
		
		//shuffle
		Collections.shuffle(AL);
		System.out.println(AL);
	}

}
