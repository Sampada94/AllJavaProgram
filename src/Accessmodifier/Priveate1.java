package Accessmodifier;

public class Priveate1 {

	private int i= 1000;  // nonstatic global variable
	
	// private access modifier -access level is within the class 
	
	public static void main(String[] args) {
		Priveate1 P1= new Priveate1();
		P1.M1();
		P1.M2();
		 
		//nonstatic global variable 
		// Syntax = System.out.println(P1.i);
		System.out.println(P1.i);
		
		//Privaet2 P2 = new Privaet2();
		//System.out.println(P2.A);
		// access level - not outside the class 
	}
	public void M1() {
		System.out.println("Private method 1");
	}
	public void M2() {
		System.out.println("Private method 2");
	}
}
