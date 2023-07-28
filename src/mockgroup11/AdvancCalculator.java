package mockgroup11;

public class AdvancCalculator implements Calculator,Casio
{

	@Override
	public void Log() {
		System.out.println("Log method");
		
	}

	@Override
	public void Sin() {
		System.out.println("Sin method");		
	}

	@Override
	public void cos() {
		System.out.println("Cos method");		
	}

	@Override
	public void Addition() {
		int A=10;
		int B= 20;
		int C= A+B;
		System.out.println("Addition method = "+C);		

	}

	@Override
	public void Substraction() {
		System.out.println("Substraction method");		
	}

	@Override
	public void Multiplicatio() {
		System.out.println("Multiplicatio method");		
	}

	@Override
	public void Division() {
		System.out.println("Division method");				
	}
	public static void main(String[] args) {
		
		AdvancCalculator A1 = new AdvancCalculator();
		A1.Addition();
		A1.Substraction();
		A1.Multiplicatio();
		A1.Division();
		A1.Log();
		A1.Sin();
		A1.cos();
		
		System.out.println();
		
		Calculator C1 = new AdvancCalculator();
		
		C1.Addition();
		C1.Substraction();
		C1.Multiplicatio();
		C1.Division();
		
		System.out.println();
		
		Casio C2=new AdvancCalculator();
		C2.Log();
		C2.Sin();
		C2.cos();
		
	//	C2.Addition();
		
		// Calculator C3 = new Calculator();
		
		
	}

}
