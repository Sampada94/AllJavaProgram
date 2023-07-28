package Practice_26_5;

public class Method_oveloading {

	public static void main(String[] args) {
		Method_oveloading obj = new Method_oveloading();
		obj.M1();
		obj.M1(100);
		obj.M1(1000,2000);
		
		

	}

	public void M1() {
		System.out.println("Zero parameter");
	}
	public void M1(int i) {
		System.out.println("One parameter = "+i);
	}
	public void M1(int i,int j) {
		System.out.println("Two parameter= "+i+" "+j);
	}
}
