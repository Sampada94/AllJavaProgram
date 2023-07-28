package Polymorphism;

public class StaticSub extends StaticSuper {
 public static void main(String[] args) {
	
	// Static polymorphism  / Compile time Polymorphism
	 StaticSub S1 = new StaticSub();
	 S1.Demo1();
	 S1.Demo2();
	 
	 System.out.println();
	 
	// Static polymorphism  / Compile time Polymorphism
	 StaticSuper S2 = new StaticSuper();
	 S2.Demo1();
	 S2.Demo2();
	 
	 System.out.println();
	 
	// sub class object reffered by Super class ref var
	// Dynamic polymorphism  / run time Polymorphism
	 StaticSuper S3 = new StaticSub();    
	 S3.Demo1();  // static method  - printing stat. is always from super class
	 S3.Demo2();  // Nonstatic method  - printing stat. is always from sub class
	 	 
}
	public static void Demo1() {    // Method hidding
		System.out.println("Sub class Static method");
	}
	public void Demo2() {   
		System.out.println("Sub class Nonstatic method");
	}
}
