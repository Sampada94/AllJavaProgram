package Constructor;

public class Default_constructor {

	String name ="sampada";
    int A= 10;
    public Default_constructor() {
    	System.out.println("Default constructor");
    	System.out.println(name);
    	System.out.println(A);
    }

	public static void main(String[] args) {
		Default_constructor AK1 = new Default_constructor();
		Default_constructor AK2 = new Default_constructor();
		Default_constructor AK3 = new Default_constructor();

	}

}
