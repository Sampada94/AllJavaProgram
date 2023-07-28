package Practice28_4;

public class Method {

	public static void main(String[] args) {
		Method M1= new Method();
		M1.Test1();
		Method.Test2();
		
		Different D1 = new Different();
		D1.Test4();
		
		Different.Test3();
	
		
	}
	public void Test1() {
		System.out.println("Sampada ");
	}
	public static void Test2() {
		System.out.println("Ghadashi");
	}
}
