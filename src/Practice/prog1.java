package Practice;

public class prog1 {
//1  if 
	public static void main(String[]args){

		int i = 50;
		if(i>=10){
		System.out.println("i is gratest no");
		}
		//2 if else
		int j = 50;
		if(i>=30) {
			System.out.println("j is gratest value");
		}
		else {
			System.out.println("j is smallest value");
		}
		
		// 3 if else if
		
		int day = 7;
		if(day==1) {
			System.out.println("monday");
		}
		else if(day==2) {
			System.out.println("Tuesday");
		}
		else if (day==3) {
			System.out.println("Wensaday");
		}
		else if (day==4) {
			System.out.println("thursday");
		}
		else if(day==5) {
			System.out.println("Friday");
		}
		else if(day==6) {
			System.out.println("saturday");
		}
		else {
			System.out.println("sunday");
		}
		
		// 4 Nested if
		
		int A= 20;
		int B = 30;
		int C= 50;
		
		if(A>B) {
			if(A>C) {
				System.out.println("A will be greatest no");
			}
		}
		else if (B>C){
			System.out.println("B will be grates no");
		}
		else {
			System.out.println("C will be grates no");
		}
		}
		}

