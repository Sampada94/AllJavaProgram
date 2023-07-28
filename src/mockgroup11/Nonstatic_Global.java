package mockgroup11;

public class Nonstatic_Global {

	int No = 34;
	String name = "Sampada";
	public static void main(String[] args) {
		Nonstatic_Global Obj = new Nonstatic_Global();
		System.out.println(Obj.No);
		System.out.println(Obj.name);
		
	Obj.M1();
	Obj.M2();
	
		
	}
	public void M1() {
		No=45;
		name="ABC";
		System.out.println(No);
		System.out.println(name);
	}
	public void M2() {
		No = 50;
		name="XYZ";
		System.out.println(No);
		System.out.println(name);
	}
	
}
