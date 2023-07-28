package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList Al=new ArrayList(); //dyanamic +homo+hetro
		
		Al.add("Welcom");
		Al.add(true);
		Al.add('A');
		Al.add(100);
		Al.add(200);
		Al.add("Java");
		Al.add(12);
		Al.add('A');
		Al.add(null);
		Al.add(30.4);
		
		  //Read the data from ArrayList
		   for(int i =0;i<Al.size();i++) {
			   System.out.println(Al.get(i));
		   } 
		   System.out.println("**************");
		   
		   //read the data from each for loop
		   for(Object A1:Al) { 
			   System.out.println(A1);
		   }
		   System.out.println("**************");
		   Iterator AL2=Al.iterator();
		   while(AL2.hasNext()) {
			   System.out.println(AL2.next());
		   }
	}		 

}
