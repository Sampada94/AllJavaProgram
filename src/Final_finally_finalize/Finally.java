package Final_finally_finalize;

public class Finally {

	public static void main(String[] args) {

		/* Finally is a block in java exception handling to execute the imp code 
		wether exception is occur or not 
		*/

		Finally.Test();
		
		Finally.Demo();
		

	}

	public static void Test() {
		
		try {
			System.out.println("Try block");
		}
		catch (Exception e) {
			System.out.println("Catch block");
		}
		finally {
			System.out.println("Finally block");
			System.out.println("*****************************");
		}
	}
	public static void Demo(){
		
		int no=100;
		
		try {
			int no1=100/0;
			System.out.println(no1);
		}
		catch(ArithmeticException e) {
			System.out.println("Inside the catch block");
			System.out.println("div by zero");
		}
		finally {
			System.out.println("Executed finally block");
		}
	}
}
