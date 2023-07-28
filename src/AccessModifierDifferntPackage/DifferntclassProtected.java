package AccessModifierDifferntPackage;

import Accessmodifier.Protected1;

public class DifferntclassProtected extends Protected1 {

	public static void main(String[] args) {
		
		Protected1 A1 = new Protected1();
		A1.M1();
		A1.M2();
		
		DifferntclassProtected DC =new DifferntclassProtected();
		DC.M1();
		DC.M2();
		 System.out.println(DC.No);
		 
	}
}
