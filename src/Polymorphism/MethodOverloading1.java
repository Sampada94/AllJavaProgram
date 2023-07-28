package Polymorphism;

public class MethodOverloading1 {

	public static void main(String[] args) {
		
		MethodOverloading1 Obj = new  MethodOverloading1();
		Obj.M1();
		Obj.M1(10);
		Obj.M1(100,25);
		Obj.M1("Sampada",28);
		Obj.M1(100,200,10);
		
		// All method are non static method 
		//So we can overload the Non static method
	}
	public void M1() {
		System.out.println("Zero parameter");
	}
	public void M1(int i) {

		System.out.println("One parameter = "+i);
	}
	public void M1(int i,int j) {
		int A = i-j;
		System.out.println("Substraction = "+A);
	}
	public void  M1(String name,int i) {
		System.out.println(""+name+" "+i);
	}
	public void M1(int a ,int b,int c) {
        int Add = a+b-c;
		System.out.println("Addition = "+Add);
	}
}
