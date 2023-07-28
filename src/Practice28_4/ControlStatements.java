package Practice28_4;

public class ControlStatements {

	public static void main(String[] args) {
		
		int No = 11;
		if(No%2==0) {
			System.out.println("given no is even no");
		}
		else {
			System.out.println("Given no is odd no");
		}
		
		int marks = 65;
		if(marks>=75) {
			System.out.println("First class");
		}
		else if (marks>=60) {
			System.out.println("Second class");
			
		}
		else if(marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("Failed");
		}
		
		//nested if eg
		
		int a = 40;
		int b = 30;
		int c = 10;
		if(a>b) {
			if(a>c) {
				System.out.println("A will be greatest value");
			}
		}
		else if (b>c) {
			System.out.println("b is gratest value");
		}
		else {
			System.out.println("C will be greatest value");
		}
		System.out.println();
		//leap year
		
		int year = 2024;
		if(((year%4==0)&&(year%100!=0))||(year%4000==0)) {
			System.out.println("given year is leap year");
		}
		else{
			System.out.println("The given year is not leap year");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
