package Practice;

public class Method {
	public static void main(String[] args) {
		
		 //direct czallin
		 M1();
		 //Calling by class
		 Method.M1();
		 
		 // Nonstatic meythod creating objet by using new keyword
		 
		 Method Obj = new Method();
		 Obj.M2();
		 
		 
		 // different class
		 //static method
		 Differentclass_method.A1();
		
		 // nonstatic method
		 Differentclass_method S1=new Differentclass_method();
		 S1.A2();
		 
	}
	 public static void M1() {
		 System.out.println("Static method");
	 }
	 public void M2() {
		 System.out.println("Nonstatic method");
	 }
}
