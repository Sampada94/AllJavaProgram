package Variable;

public class Static_Global_Variable1 {

	/* Static Global Variable = Variable declare oudside the any method 
	but inside the class */
	
	static int No = 200;
	
	public static void main(String[] args) {
		// nonstatic method calling 
		Static_Global_Variable1 Obj = new Static_Global_Variable1();  // Object creation by New keyword
		
		Obj.A1();         // calling object in main method 
		Obj.A2();
		Obj.A3();
		
		Static_Global_Variable1.A4();   // static method calling
		Static_Global_Variable1.A5(); 
		
	}
	public void A1() {
		System.out.println(No); //200
		 No = 400;
		System.out.println(No); // 400
	}
	public void A2() {
		No = 600;
		System.out.println(No); //600
	}
	public void A3() {
		System.out.println(No); //600
	}
	public static void A4 () {
		No = 700;
		System.out.println(No); //700
	}
	public static void A5() {
		System.out.println(No); //700
	}
}
