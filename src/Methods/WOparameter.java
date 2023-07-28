package Methods;

public class WOparameter {
public static void main(String[] args) {
	//Methods without parameter or zero parameter
	WOparameter wo = new WOparameter();
	wo.Add();
	wo.Sub();
	
	// calling by class
	// WOparameter,Add();  not static method cant call this way .
	//non static method for calling create object then call 
	WOparameter.Sub();  // static method call only this way
	
}
public void Add () {    // Nonstatic Method
	int A = 32;
	int B = 654;
	int C = A+B;
	System.out.println("Addition of two numers C== "+C);
}
public static void Sub() {  
	// Static method also called bye creation of object - only show warning msg 
	int P = 87;
	int Q = 57349605;
	int R = P+Q;
	System.out.println("Substraction of two numbers R == "+R);
}

}
