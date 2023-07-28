package Practice28_4;

public class Variable {
int i = 10;
public static void main(String[] args) {
	Variable V1= new Variable();
	
	System.out.println(V1.i);
	
	Variable.Demo1();
}
public static void Demo1() {
	int a = 40;
	System.out.println(a);
}
}
