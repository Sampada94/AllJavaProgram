package Methods;          // pakage name is Methods

public class Static1 {    // Class name is StaticRegular
	
	// Static regular method calling from same class
	
		public static void main(String[]args) {
			
			System.out.println("Main method started");
			
			// 1. Direct calling 
			
			// Syntax = Methodname();
			 Sameclass1();               // Sameclass1 is a method name 
			 Sameclass2();
			 
			 // 2. calling by class
			 
			 //Syntax = Classname.Methodname();
			 
			Static1.Sameclass1();
			Static1.Sameclass2();
			
			System.out.println("Main method ended");
		}

		  public static void Sameclass1 () {        // Sameclass1 is a method name 
			  System.out.println("Static main method calling from same class --- Sameclass1");
		  }
		 	 
		  public static void Sameclass2() {
			  System.out.println("Static main method calling from same class --- Sameclass2");  
		  }
}
