package Practice;

public class Variable1 {
int No = 10;  // nonstatic global variable
static String name ="Sampada";  // static global variable

	public static void main(String[] args) {
		
		// local variable
		int i =30;
		System.out.println(i);

		Variable1 Obj = new Variable1();   //// nonstatic global variable 
		System.out.println(Obj.No);
		 
		System.out.println(Variable1.name);  // static global variable
		
		
		
		System.out.println(Differntclass_Variable1.A);  // differnt class static variable
		
		
		// differnt class nonstatic variable
		
		Differntclass_Variable1 S1=new Differntclass_Variable1();
		System.out.println(S1.B);
	}

}
