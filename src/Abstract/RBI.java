package Abstract;

public abstract class RBI {
 
	public void Loan() {     //non Abstract method
	 System.out.println("RBI = Loan");
 }
	public abstract void Creditcard();  //Abstract method
	
	public abstract void Debitcard();    //Abstract method
	
}

