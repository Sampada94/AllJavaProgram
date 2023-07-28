package Keywords;

public class Superchild extends SuperParent {

	public static void main(String[] args) {
		
		Superchild S1 = new Superchild();
		S1.Demo();
		
	}
	public void Demo() {
		System.out.println(super.Number);
		System.out.println(super.name);
	}
    // Super keyword used to access global variable from different class or super class
}
