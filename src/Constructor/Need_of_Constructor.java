package Constructor;

public class Need_of_Constructor {

	public Need_of_Constructor() {
		 System.out.println("Default constructor");
	}
	String name= "Sampada";   // Nonstatic global variable
	int i = 23;
	String name1="ABC";
	int j = 40;
	static int k=100;  //// static global variable
	
	public static void main(String[]args) {
		Need_of_Constructor S1= new Need_of_Constructor();
		Need_of_Constructor S2 = new Need_of_Constructor();
		//...
		Need_of_Constructor S100 = new Need_of_Constructor();
		
		S1.M1();
		S1.M2();
		S2.M1();
		S2.M2();
		
		Need_of_Constructor.M3();
		S1.M3();

		
	}
	public void M1() {     // nonstatic method
		System.out.println(name+" "+i);
		
	}
	public  void M2() {     // nonstatic method
		System.out.println(name1+" "+j);
	}
	public static void M3() {     // static method
		System.out.println(k);
	}
	/* purpose of constructor
	1. once we create a object compulsary we requird to perform initialisation
	2.Constructor is spcl design for init. of object
	3.Constructor is spcl type of method
	4. every times object is created using new keyword at least one 
	constructoris called */
}
