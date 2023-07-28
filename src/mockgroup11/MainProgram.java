package mockgroup11;

public class MainProgram {

	public static void main(String[] args) {
		
		Father F1 = new Father();   // static poly / compile time
		F1.Home();
		F1.Car();
		F1.Money();
		
		System.out.println();
		
		Son S1 = new Son();   // static poly / compile time
		S1.Bike();
		S1.Home();
		S1.Car();
		S1.Money();
			
		System.out.println();
		
		Father F2 = new Son();   // dyanamic  / run time / top cast
		F2.Home();  // 2 bhk

		F2.Car();  // swift
		F2.Money();  // 2 crore
		// F2.Bike();
		
		}
	
}
