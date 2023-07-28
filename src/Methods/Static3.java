package Methods;

public class Static3 {

public static void main(String[] args) {
		
		// static regular method calling from differnt class
		
		System.out.println("Main method started");
		
		// direct calling method    
		// direct calling method is not available in differnt method
		//syntax = Methodname();
	    Sampada();
		
		// calling by class name
		
		//syntax = Classnmae.Methodname
		
		Static2.test1();                // static regular method from differnt class
		Static2.test2();
		Static3.Sampada();                     //static regular method from same class
		
		System.out.println("Main method ended");
		
	}
	public static void Sampada() {                     // extra part same class program
		System.out.println("Same class = Sampada ");
	}
}
