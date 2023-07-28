package Abstract;

public class MainProg {

	public static void main(String[] args) {
		
	HDFC H =new HDFC();   // static + Compile time +Early binding
		H.Creditcard();   //HDFC Creditcard
		H.Debitcard();      //HDFC Debitcard
		H.Fund();         // HDFC Fund
		H.Loan();         // RBI = Loan
	
		
		System.out.println();
		
		RBI R = new HDFC();  // dynamic +run time +topcasting+late binding
		R.Creditcard();    //HDFC Creditcard
		R.Debitcard();     // HDFC Debitcard
		R.Loan();      //RBI = Loan

		
		// R.Fund();
	}
}
