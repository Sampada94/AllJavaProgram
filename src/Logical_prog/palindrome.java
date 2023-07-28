package Logical_prog;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		int Orignalnumber,sum,rem;
		
		System.out.println("Enter a number");
		
		Scanner SC=new Scanner(System.in);
		int no=SC.nextInt();
		
		Orignalnumber=no;    //121
		
		for(sum=0;no>0;no=no/10) {   //121>0 true
			rem=no%10;           //rem=121%10 =1    rem=12%10=2       rem=1%10=1
			sum=sum*10+rem;      //sum=0*10+1=1     sum=1*10+2=12     sum=12*10+1=121
			
		}
		if(sum==Orignalnumber) {    // 121==121  true
			System.out.println("Palindrom number");
		}
		else {
			System.out.println("Not Palindrom number");
		}
	}

}
