package Constructor;

public class Rule1 {
// 1 . we can't create constructor inside the method
	public Rule1() {
		
		// 2.constructor name should be same as class name
		System.out.println("Sampada");
		
	}
	public static void main(String[] args) {
		Rule1 SA = new Rule1();
		
	}
	//3.we should not declared retun type constructor like void
		// if we declared void keyword in constructor that tym compiler treated as a method 
	// 4.Applicable modifire /specifier- public, privet,protected
	// Not Applicable modifire /specifier- Static , final, Abstract,native
	}

