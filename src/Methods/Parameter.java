package Methods;

public class Parameter {
 public static void main(String[] args) {
	// Static & Nonstatic regular method with parameter
	 
	 Add(25,65);                  // direct calling
	 Sub(98,79);
	 Mul(89,12.3f);
	 Exp(10,20,5);       // Static with 3 parameter
	 
	 Parameter.Add(64,899);               // calling by class
	 Parameter.Sub(8564, 568);
	 Parameter.Add(5555, 598);   
	 // In this we do multiple operation methods n time 
	 Parameter.Mul(45,45.68f);
	 
	 Parameter obj = new Parameter ();    // Non static- creation of object & then call
	 obj.Add1(698, 234568);
	 
	 Parameter.Exp(45, 52, 23);           // Static with 3 paramete++++++++++++++++++++++++++++++++++++++ 
}
 public static void Add(int A, int B ) {
	int C = A+B;
	System.out.println("Addition of two no C ==> "+C);
 }
 public static void Sub(int P,int Q) {
	 int R = P-Q;System.out.println("Substraction of two no R ==> "+R);
 }
 
 public static void Mul(int X,Float Y) {
	 Float Z = X*Y;
	 System.out.println("Multiplication of two no Z ==> "+Z);
 }
 public void Add1(int L,int M) { // Nonstatic method
	 int N = L+M;
	 System.out.println("Addition of two no N ==> "+N);
 }
 public static void Exp(int a,int b,int c) {
	 int d = a+b-c;
	 System.out.println("Expression is d==> "+d);
	 
 }
}
