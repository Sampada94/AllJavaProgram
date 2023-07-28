package Polymorphism;

public class Son extends Father {

	public void Bike () {
		System.out.println("Bike = Royal Enfield");
	}
  //method overriding
	// car class with same argument present in father class also
	public void Car () {       
		System.out.println("Car = Swift");
	}
	public static void main(String[] args) {
		
		
		Father F1 = new Father ();
		F1.Home();   // 2 BHK
		F1.Car();    // Baleno
		F1.Land();   //100 Acre
		F1.Test();   // Test Method
		
		System.out.println();
		
		// Static polymorphism / compile time polymorphism
		
		Son S1 = new Son();
		S1.Bike();   // Royal Enfield
		S1.Home();   // 2 BHk
		S1.Car();    // Swift
		S1.Land();   // 100 Acre
		S1.Test();   // Test Method
		
		System.out.println();
		
		// Dyanamic polymorphism / Run time polyorphism  
		// Son class object reffered by father class ref var 
		// sub class object reffered by Super class ref var
		
		Father FS = new Son();
		FS.Car();     // Swift   // 1st check class where car is present mns in son class 
		FS.Home();    // 2 BHK  // home is not present in son class so from father class it is 2 BHK
		FS.Land();    // 100 Acre
		FS.Test();    // Test Method
	//	FS.Bike();    // bcz bike is not present in father class & we reffered father class
		
		
	}
}
