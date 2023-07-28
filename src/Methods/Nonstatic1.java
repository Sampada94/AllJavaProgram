package Methods;

public class Nonstatic1 {
	
     // Non static method Calling from same class
	
	public static void main(String[]args) {
		System.out.println("Main method started");
		
		// Direct calling 
		//Sameclass();
		//Sameclass();
		
		// Calling from class
		// Nonstati1c.Sameclass1();
		//Nonstatic1.Sameclass2();
		 
		// In nonstatic method we will not direct call the method 
		//for this object creation is imp
		// Object creation by using New keyword
		//Syntax = Classname Refvariablename = new Classname();
		
		Nonstatic1 obj = new Nonstatic1();
		
		// After creating the object ,copy all the non static methods will be stored in object
		 // refvariablename.methodname();  here ref variable name = obj 
		obj.Sameclass1();
		obj.Sameclass2();
		obj.Sameclass3();
		Nonstatic1.Sameclass4();     // static method calling from same class
		obj.Sameclass4();            // static method bye using object creation method
		
		//can i access static method by using object method- yes only warning message thrown 
		
		System.out.println("Main method ended");
		
	}
	public void Sameclass1() {       // Nonstatic method - static word absent 
		System.out.println("Non static method calling from same class1= Sameclass1");
		
	}
	public void Sameclass2() {
		System.out.println("Non static method calling from sameclass2= Sameclass2");
	}
	public void Sameclass3() {
		System.out.println("Welcome");
	}
	public static void Sameclass4() {      // Static method
		System.out.println("Bye");
	}
}
