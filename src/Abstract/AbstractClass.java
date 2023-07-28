package Abstract;

public class AbstractClass extends AbstractClassConstructor {

	public AbstractClass() {
		
		super(); // at time only one super keyword use
		
		System.out.println("Subclass Constructor");
	}
	public static void main(String[] args) {
		
		AbstractClass A1 = new AbstractClass();
		
		
	}
	
}
