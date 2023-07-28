package Variable;

public class Nonstatic_Global_variable1 {

	// nonstatic global variable declaration 
	//Syntax= System.out.println(Refvariablename.variablename);
	
	
	 int Age = 29;       // these are nonstatic global variable which are declare outside method 
	String name ="Sampada";
	
	public static void main(String[] args) { 
		
		Nonstatic_Global_variable1 Obj=new Nonstatic_Global_variable1();
		// System.out.println(Refvariablename.variablname);
		System.out.println(Obj.Age); //29
		System.out.println(Obj.name); // Sampada
		
		
		 Obj.A1();    // this is simple non static method calling way for line no 22 to 26
		
	}
	public void A1() { //nonstatic
		 int Age = 30;  // this is not shown in result by nonstatic global method
		String name="Akshay";   // for this both we call obj.A1 - shown result in console 
		System.out.println(Age);
		System.out.println(name);
		
	}
}
