package Logical_prog;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		// prime no = 2,3,5,7,11,13,17,19,23,29,......
		
		System.out.println("Enter a number"); //5
		
		Scanner SC=new Scanner(System.in);
		
		int No=SC.nextInt();
		int i;
		
		for(i=2;i<No;i++)  // 2<5 true   2<6 true
			if(No%i==0)    //5%2==0  1==0 false   6%2=3 reminder =0 0==0 true
				break;
			if(i==No)  //2==5 false  3==5 false 5==5 true
				System.out.println("Given number is prime number");
		
		else
		System.out.println("Given number is not prime number");
			
			
			
	}

}
