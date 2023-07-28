package Accessmodifier;

public class Protected1 {
 
	protected int No =100;
	
	public static void main(String[] args) {
	
		Protected1 S1 = new Protected1();
		S1.M1();
		S1.M2();
		
		System.out.println((S1.No)); //100
		
	}
	public void M1() {
		System.out.println("Protected method 1");
	
}
	public void M2() {
		System.out.println("Protected method 2");
	}
}