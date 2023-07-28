package Polymorphism;

public class MainProgCar {

	public static void main(String[] args) {
		
		// Static polymorphism  / Compile time Polymorphism
	 Car C1 = new Car();
	 C1.Start(); //Car Start
	 C1.Stop();  // Car Stop
	 C1.Reful(); // car Reful
	
	 System.out.println();
	 
	// Static polymorphism  / Compile time Polymorphism
	 Maruti M1 = new Maruti();
	 M1.Start(); // Maruti Start
	 M1.Test();  // Test Maruti
	 M1.Stop();  // Car Stop
	 M1.Reful();  // Car reful
	 
	 System.out.println();
	 
	// sub class object reffered by Super class ref var
	// Dynamic polymorphism  / run time Polymorphism
	 Car CM = new Maruti();
	 CM.Start();  // Maruti Start
	 CM.Stop();   // Car stop
	 CM.Reful();   // Car Reful
	// CM.Test();
	}
}
