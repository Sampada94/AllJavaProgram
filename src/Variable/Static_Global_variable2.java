package Variable;

public class Static_Global_variable2 {

	static int No = 50;
	static String Name = "Sampada";
	
	public static void main(String[] args) {
		
		System.out.println(No); // 50
		System.out.println(Name);  // Sampada
		
		Static_Global_variable2.A1(); // 50  // Sampada
		
		Static_Global_variable2 Obj = new Static_Global_variable2(); // creation of object 
		Obj.A2();
		
		Static_Global_variable2.A3();  //Akshay
	}
	public static void A1 () {
		System.out.println(No);
		System.out.println(Name);
	}
	public void A2() { // nonstatic methodm
		No = 400;
		Name = "Akshay";
		
				System.out.println(No);
		System.out.println(Name);
	}
	
	public static void A3() {
		System.out.println(Name);
	}
}
