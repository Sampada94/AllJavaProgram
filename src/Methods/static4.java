package Methods;

public class static4 {

	public static void main(String[]args) {
		
		System.out.println("Main program started");
		// Direct Calling 
		//Syntax = Methodname();
		Addition();
		
		// Calling by class
		//Syntax = Classname.Methodname();
		static4.Addition();  // Static regular method calling from same class ie static4 program
		
		Static5.Add();     // static regular method calling from differnt class ie Static5 program
		Static5.Sub();
		Static5.Multi();
		Static5.Div();
			
		System.out.println("Main program Ended");
	}
	
	public static void Addition() {
		int A = 234;
		int B = 569;
		int C = A+B;
		System.out.println("Addition of two numbers C = "+C);
			
	}
	
}
