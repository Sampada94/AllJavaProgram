package Polymorphism;

public class MethodOverload2 {
public static void main(String[] args) {
	
	MethodOverload2.M1();
	MethodOverload2.M1(500);
	MethodOverload2.M1(100,400);
	MethodOverload2.M1("Sampada",1);
	MethodOverload2.M1(150,56,78.50f);

	//All methods are static method
	// we can overload static method 
	
}
public static void M1() {
	System.out.println("Zero parameter");
}
public static void M1(int i) {
	System.out.println("One parameter = "+i);
}
public static void M1(int i,int j) {
	System.out.println("Two Parameter = "+i+" "+j);
}
public static void  M1(String name,int i) {
	System.out.println("Two Parameter = "+name+" "+i);
}
public static void M1(int i ,int j,float k) {
	System.out.println("Three parameter = "+i+" "+j+" "+k);
	
}
}
