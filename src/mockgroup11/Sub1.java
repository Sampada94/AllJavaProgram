package mockgroup11;

public class Sub1 extends Super1 {

	public static void Demo1() {
		System.out.println("Static method sub class");
	}
	public void Demo2() {
		System.out.println("Nonstatic method sub class");
	}
	public static void main(String[] args) {
		
	//	superclass refvarname = new Subclass();
		
		Super1 S1 = new Sub1();  // dynamic / run time/top 
		S1.Demo1();   //Static method super class  // method hidden
		S1.Demo2();   // Nonstatic method sub class  // override
		
	}

}
