package Constructor;

public class Default_constructor2 {

	// It is always no argument/zero argument constructor
	// access modifier of the default constructor is same as class modifier
	// Default constructor contain only one line ie super() class/keyword
	// default constructor is use to provide the default values to the object 
	// eg null , 0,false
	public static void main(String[] args) {
		Default_constructor2  AK1 =new Default_constructor2 ();
		Default_constructor2 AK2 = new Default_constructor2 ();
	
		AK1.M1();
		AK1.Add();
		AK2.M1();
		AK2.Add();
		
		
	}
	public void M1() {
		System.out.println("Sampada");
	}
	public void Add() {
		int A = 10;
		int B = 30;
		int add = A+B;
		System.out.println(add);
	}
}
