package Variable;

public class Local_variable1 {

	/*  Local variable = variable declare inside method ie from lin no 7 
	    to line no 24 
	    static variable can not declared inside the method (main method or any other method)
	    so local variable having  1 type ie nonstatic variable
	 */
	public static void main(String[] args) {
	
	 int No=10;
	System.out.println(No);
	//1. direct calling
	// syntax = Methodname();
	//m1();
	
	//2. calling by class
	//syntax= classname.methodname();
	
	Local_variable1.m1();  // 20 Sampada
	
	Local_variable1 Obj = new Local_variable1();
	Obj.m2(); // 30
	
	
}
public static void m1() { // static method
	 int A = 20 ;  // nonstatic local varible
	String Name = "Sampada";
	System.out.println(A);
	System.out.println(Name);
	}
public void m2() {  // nonstatic method
	//int No=20;/ nonstatic local variable
	System.out.println();
	
}
}
