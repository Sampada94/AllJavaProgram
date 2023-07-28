package Constructor;

public class Rule5 {

	// any no of constructor can be declaredin java class 
	// but constructor name should be same as class name 
	// but argument or parameter are differnt 
	
	public static void main(String[] args) {
		
	Rule5 AK1 = new Rule5();
	Rule5 AK2 = new Rule5(1);
	Rule5 AK3 = new Rule5(1,2);
	Rule5 AK4 = new Rule5(1,2);
		
	}
	public Rule5() {
		System.out.println("Zero Input argument constructor");
		
	}
	public Rule5 (int A) {
		System.out.println("One Input argument constructor");
	}
	public Rule5(int A,int B) {
		System.out.println("Two Input argument constructor");

	}
	public Rule5(int A,int B,int C) {
		System.out.println("Three Input argument constructor");
	}
}

