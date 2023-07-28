package Final_finally_finalize;

public class finalized {

	public static void main(String[] args) {
	
		/*finalized is method in java which is used to perform cleanup processing just before 
		object id garbage collected
*/
		finalized F1=new finalized();
		F1.Demo();
		
		F1=null;
		System.gc();
		
		
		
	}
	public void Demo() {
		System.out.println("demo method");
	}

	public void finalize() {
		System.out.println("Finalisez method executed");
	}
}
