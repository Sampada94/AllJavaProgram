package Abstract;

public class CompleteClass {

	public static void main(String[] args) {
		CompleteClass C1=new CompleteClass();
		C1.Test1();
		C1.Test2();
		
		//  complete method = method declaration + method Defination
		// non abstract method ( abstract word not present)
	}
	public void Test1() {   // method declaration
		System.out.println("Complete Method 1");  // Method defination 
	}
	public void Test2() {          // method declaration
		System.out.println("Complete Method  2");    // Method defination 
	}
}
