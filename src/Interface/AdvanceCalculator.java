package Interface;

public class AdvanceCalculator implements Calculator,Casio {

	@Override
	public void Log() {
		System.out.println("Log method");
		
	}

	@Override
	public void Rad() {
         System.out.println("Radian method");		
	}

	@Override
	public void Addition() {
		System.out.println("Addition method");
		
	}

	@Override
	public void Substraction() {
	System.out.println("Substraction method");
		
	}

	@Override
	public void Multiplication() {
		System.out.println("Multiplication method");		
	}

	@Override
	public void Division() {
		System.out.println("Division method");		
	}

	public static void main(String[] args) {
		
		AdvanceCalculator A1 = new AdvanceCalculator();
		//Static + Compile time + Early binding 
		A1.Addition();
		A1.Substraction();
		A1.Multiplication();
		A1.Division();
		A1.Log();
		A1.Rad();
		
		System.out.println();
		
		Calculator C1=new AdvanceCalculator();
		// dyanamic +Run time + LAte binding
		C1.Addition();
		C1.Substraction();
		C1.Multiplication();
		C1.Division();
		
		
		//C1.Log();    // both method present in Casio so not call
		//C1.Rad();
		
		Casio C2 = new AdvanceCalculator();
		
		C2.Log();
		C2.Rad();
	//	C2.Addition();
		
		
	}
}
