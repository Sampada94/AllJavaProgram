package Interface;

public class TestClass {

	public static void main(String[] args) {
		
		HSBCBank H1 = new HSBCBank();
		H1.Bikeloan();
		H1.Carloan();
		H1.Creditcard();
		H1.Debitcard();
		H1.MutualFund();
		H1.Personalloan();
		H1.transfermoney();
		
		System.out.println(H1.MinBalance);
		
		System.out.println();
		
		USBank U1=new HSBCBank();
		U1.MutualFund();
		U1.Carloan();
		
		System.out.println();
		
		RBIBank R1 = new HSBCBank();
		R1.Creditcard();
		R1.Debitcard();
		R1.transfermoney();
		
		System.out.println();
		
		BrazilBank B1=new HSBCBank();
		B1.Bikeloan();
		B1.Personalloan();
		
	}
	
}
