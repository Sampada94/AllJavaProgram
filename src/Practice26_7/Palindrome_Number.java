package Practice26_7;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		int no,sum,rem;
		System.out.println("Enter a number"); //121
		Scanner Sc=new Scanner(System.in);
		int num=Sc.nextInt();
		no=num; //121
		
		for(sum=0;num>10;num=num/10) {
			rem=num/10; // rem=121/10=12 rem=1  rem=12/10=2  rem=1/10=1
			sum=sum*10+rem; //0*10+1=1  sum=1*10+2=12   sum=12*10+1=121
		}

		if(no==sum) {
			System.out.println("Palindrom number");
		}
		else{
			System.out.println("not palindrome number");
		}
	}

}
