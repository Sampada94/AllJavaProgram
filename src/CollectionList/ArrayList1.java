package CollectionList;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
	
		int arr[]=new int[10];  //static+homo
		
		ArrayList Al=new ArrayList(); //dyanamic +homo+hetro
		
		ArrayList<String> Al1=new ArrayList<String>();
	//	Al1.add("Sampada");
	//	Al1.add(true);
		
		//((10*3)/2)+1=(30/2)+1=16
		
		//1. Add = to add the element in arraylist
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
		
		System.out.println(Al);
		
		//2. Size = retun the number of element in this llist
		System.out.println(Al.size());
		
		//3. Remove 
		Al.remove("Welcom");
		Al.remove(2);
	//	Al.remove('A');  // it will throw outofbound exception 
	//	Al.remove(200);  // it will throw outofbound exception 
		System.out.println(Al);
		System.out.println(Al.size());
		
		//4. Insert new Element 
		// syntax = Al.add(index ,insert value)
		
		Al.add(2,'C');
		Al.add(8,500);
		System.out.println(Al);
		
		//5. Retrieve specific element
		//get - retun the element at the specified position in this list
	
		System.out.println(Al.get(0));
	//	System.out.println(Al.get(15));  //IndexOutOfBoundsException
	
		//6 Rplace method /change method
		
    	Al.set(2, "Pyathon");
	    System.out.println(Al);
	    
	    //7 isempty
	    
	    System.out.println(Al.isEmpty()); // False
	    
	    System.out.println(Al1.isEmpty());  //true
	    
	    
	    
		
		
		

	}

}
