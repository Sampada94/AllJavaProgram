package Interface;

public class HSBCBank implements RBIBank ,USBank,BrazilBank {

	@Override
	public void Bikeloan() {
System.out.println("HSBC Bank - Bike Loan");		
	}

	@Override
	public void Personalloan() {
		System.out.println("HSBC Bank - Personal Loan");		
		
	}

	@Override
	public void MutualFund() {
		System.out.println("HSBC Bank - Mutual fund ");		
		
	}

	@Override
	public void Carloan() {
		System.out.println("HSBC Bank - Car Loan");		
		
	}

	@Override
	public void Creditcard() {
		System.out.println("HSBC Bank - Creditcard");		
		
	}

	@Override
	public void Debitcard() {
		System.out.println("HSBC Bank - Debitcard");		
		
	}

	@Override
	public void transfermoney() {
		System.out.println("HSBC Bank - Transfermoney");		
		
	}

	
}
