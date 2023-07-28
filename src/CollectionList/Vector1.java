package CollectionList;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector VC=new Vector();
		
		VC.add("Java");
		VC.add("Python");
		VC.add(44);
		VC.add(true);
		VC.add('F');
		VC.add(100);
		VC.add("test");
		System.out.println(VC);

		System.out.println(VC.size());
		
		//remove
		VC.remove(2);
		System.out.println(VC);
		
		//update-set
		VC.set(4,"Sampada");
		System.out.println(VC);
		
		
	}

}
