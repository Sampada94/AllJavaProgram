package Inheritance;

public class Mainprogram {

	
	// Inheritance - one class aquierd property of onther class with help of extends keyword 
	
	public static void main(String[] args) {
	
		// Single level Inheritance
		// It take place between two classes 
		// Superclass - the class from where properties are aquired
		//Subclass - the class to where properties are delivered
		
		Subclass1 S1 = new Subclass1 ();
		S1.Bike();
		S1.Home();
		S1.Car();
		S1.Land();
		
		System.out.println("  ");
		
		Superclass S2 = new Superclass ();
		S2.Home();
		S2.Car();
		S2.Land();
		
		System.out.println("  ");
		
		// multilevel Inheritance
		// It take place between 3 or more than 3 classes
		
		Whatsapp1 W1=new Whatsapp1();
		W1.TextMsg();
		
		System.out.println("  ");
		
		Whatsapp2 W2=new Whatsapp2();
		W2.TextMsg();
		W2.Audiocall();
		
		System.out.println("  ");
		
		Whatsapp3 W3=new Whatsapp3();
		W3.TextMsg();
		W3.Audiocall();
		W3.Videocall();
		
		System.out.println("  ");
		
		Whatsapp4 W4=new Whatsapp4();
		W4.TextMsg();
		W4.Audiocall();
		W4.Videocall();
		W4.Payment();

		System.out.println("  ");
		
		// Hierarchical Inheritance
		// Multiple subclasses can aquired properties of one superclass
		
		Father F1 = new Father();
		F1.Home();
		F1.Car();
		F1.Land();
	
		
		System.out.println("  ");
		
		Son1 S11 = new Son1();
		S11.Mobile();
	    S11.Home();
		S11.Car();
		S11.Land();
		
		System.out.println("  ");
		
		Son2 S12 = new Son2();
		S12.Bike();
		S12.Home();
		S12.Car();
		S12.Land();
		
		System.out.println("  ");
		
		Son3 S13 = new Son3();
		S13.Laptop();
		S13.Home();
		S13.Car();
		S13.Land();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
