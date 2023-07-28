package Abstract;

public abstract class AbstractClassConstructor {

	public AbstractClassConstructor() {
		
		// at time only one this keyword use 
		this(100);   // op will be One input Parameter constructor
		
	//	this(100,500);  // op will be Two input Parameter constructor
		
		System.out.println("Abstract class constructor");
	}
	
	private AbstractClassConstructor(int i) {
		System.out.println("One input Parameter constructor");
	}
	private AbstractClassConstructor(int i,int j) {
		System.out.println("Two input Parameter constructor");
	}
}
