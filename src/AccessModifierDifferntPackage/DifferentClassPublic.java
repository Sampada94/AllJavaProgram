package AccessModifierDifferntPackage;

import Accessmodifier.Public;

public class DifferentClassPublic {

	public static void main(String[] args) {
		Public S1=new Public();
		
		S1.M1();
		S1.M2();
		
		System.out.println(S1.i);
	}
}
