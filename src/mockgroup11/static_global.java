package mockgroup11;

public class static_global {
static int No = 50;   
static String name = "Sampada";

public static void main(String[] args) {
	static_global Obj = new static_global();
	Obj.A1();
	
	static_global.A2();
	static_global.A3();
	
}
public void  A1() { // nonstatic method
	System.out.println(No);
	System.out.println(name);
}
public static void A2() {
	No =10;
	name = "ABC";
	System.out.println(No);
	System.out.println(name);
}
public static void A3() {
	System.out.println(No);  
}
}
