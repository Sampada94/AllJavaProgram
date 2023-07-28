package Logical_prog;

import java.util.Scanner;

public class User_ip_scanner {

	public static void main(String[] args) {
	
		System.out.println("Enter a number");
		Scanner S1=new Scanner(System.in);
	    
		int no =S1.nextInt();
		System.out.println("Enter second number");
		int no1 =S1.nextInt();
		
		System.out.println("Addition of two no:"+(no+no1));
		System.out.println("Substraction of two no:"+(no-no1));

	}

}
