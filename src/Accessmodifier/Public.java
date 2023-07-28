package Accessmodifier;

public class Public {

	public int i = 100;
	public static void main(String[] args) {
		
		Public P1=new Public();
		P1.M1();
		P1.M2();
		
		System.out.println(P1.i);
		
	// public access modifier = access level outside the pakage & inside the pakage
		// withing the class & outside the class
		
		Public2 P2=new Public2();
		System.out.println(P2.No);
		
	}
	public void M1() {
		System.out.println("Public method 1");
	}
	public void M2() {
		System.out.println("Public method 2");
	}
}
