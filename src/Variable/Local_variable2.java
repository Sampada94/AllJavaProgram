package Variable;

public class Local_variable2 {
public static void main(String[] args) {
	
	Local_variable2.A1();
	Local_variable2.A2();
	
}
public static void A1() {
	int No = 200;               // Non static local variable - inside the method
	System.out.println(No);
}
public static void A2() {
	int i = 10;                // Non static local variable - inside the method
	int j = 20;
	int Add = i+j;
	System.out.println(Add);
}
}
