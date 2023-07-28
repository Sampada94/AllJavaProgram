package Practice_26_5;

public class Method_overloading_Static {

	public static void main(String[] args) {
		Method_overloading_Static.M1();
		Method_overloading_Static.M1(100);
		Method_overloading_Static.M1(400,500);
		
		
		
	}
	public static void M1() {
		System.out.println("Zero parameter");
	}
	public static void M1(int i) {
		System.out.println("One parameter ="+i);
	}
	public static void M1(int i,int j) {
		System.out.println("Two parameter = "+i+" "+j);
	}
}
