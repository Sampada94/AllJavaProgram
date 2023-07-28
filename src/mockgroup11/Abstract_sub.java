package mockgroup11;

public class Abstract_sub extends Abstract_Super {

	@Override
	public void car() {
	System.out.println("Car==Baleno");
		
	}

	@Override
	public void land() {
		System.out.println("Land== 50 acre");
		
	}

	public void mobile() {
		System.out.println("Mobile==iphone");
	}
	
		
	public static void main(String[] args) {
		
		Abstract_sub A1 = new Abstract_sub();  //static binding /early binding
		A1.home();  //2bhk
		A1.car();  // 
		A1.land();
		A1.mobile();
		
		// superclass refvarname = new subclass
		 Abstract_Super A2 = new Abstract_sub();  // dynamic binding / latebinding/topcasting/up casting
		 A2.home();
		 A2.car();
		 A2.land();
		
	}
  
	
	
}
