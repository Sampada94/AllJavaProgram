package Keywords;

public class This {

	int RollNo = 10;
	String name = "Sampada";
	public static void main(String[] args) {
		This T1 = new This();
		T1.Test1();
		
		
	}
	public void Test1 () {
		int RollNo = 20;
		String name = "Ghadashi";
		System.out.println(RollNo);
		System.out.println(name);
		
		System.out.println();
		
		System.out.println(this.RollNo);
		System.out.println(this.name);
	}
	
	// this keyword used to access global variable from same class 
}
