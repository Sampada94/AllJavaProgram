package ControlStatement;

public class If {
public static void main(String[] args) {
	int A=55;
	int B = 40;
	int C = 76;
	
	/* simple If Staement
	 Syntax 
	 if(condition){
	 Statement executed when condition is true
	 }  */
	
	if(A>50) {    // condition is true so result will be display
		System.out.println("A is larger value");
	
	}
	// If simple program 2
	if(B+C<100) {   // condition is false so result will not display
		System.out.println("Addition is greater than 100 ");

	
	}
	System.out.println("program completed");
}
}
