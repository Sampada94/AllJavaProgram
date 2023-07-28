package Accessmodifier;

public class DifferentClass {

	public static void main(String[] args) {
		
		// public , Protected , Default these 3 accessmodifier having access level outside 
		// inside the one package
		
		Public P1=new Public();
		P1.M1();
		P1.M2();
		System.out.println(P1.i);
		
		System.out.println();
		
		Protected1 S1 = new Protected1();
		S1.M1();
		S1.M2();
		System.out.println(S1.No);
		
		System.out.println();
		
		Default1 D1 =new Default1();
		 D1.Demo1();
		 D1.Demo2();
		 System.out.println(D1.RollNo);
		 
		 // privet access level is not outside the class
		 
		//  Priveate1 P1= new Priveate1();  
		//	P1.M1();
		//	P1.M2();
	}
		
}