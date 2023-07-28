package Casting;

public class Sonclass extends Superclass {

	public void home() {
		System.out.println("Sub class");
	}
public void car() {
 System.out.println("car-baleno");
}

public void laptop() {
	System.out.println("Laptop-HP");
}
public static void main(String[] args) {
	Sonclass S1 = new Sonclass();  // static
	S1.car();
	S1.home();
	S1.laptop();
	
	Superclass S2 =new Sonclass();  //up casting  
	S2.car();
	S2.home();
	
	// Sonclass S3=new Superclass();  //downcasting 
	
	
}
}
