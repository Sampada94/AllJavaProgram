package Practice;

public class date20 {

	public static void main(String[] args) {
		int A=50;
		if(A%2==0){
		System.out.println("A is even no ");
		System.out.println();
		}
		int b = 33;
		if(b%2==0){
		System.out.println("b is even no");
		}
		else{
		System.out.println("b is odd no");
		}
		System.out.println();
		
		int marks =91;
		if(marks>=75){
		System.out.println("First class");
		}
		else if(marks>=60) {
		System.out.println("Second class");
		}
		else if(marks>=35){
		System.out.println("Pass");
		}
		else{
		System.out.println("fail");
		System.out.println();
		}
		int S = 20;
		int P =300;
		int R = 100;

		if(P>=S){
		if(P>=R){
		System.out.println("P is gratest no");
		}
		}
		else if (S>=R){
		System.out.println("S is a gratest no");
		}
		else{
		System.out.println("R is a gratest no");
		}
		
		int year = 2000;
		if(((year %4==0)&&(year%100!=0))||(year%4000==0)){
		System.out.println("Given year is leap year");
		}
		else{
		System.out.println("Given year is not leap year");
		}
	}

}
