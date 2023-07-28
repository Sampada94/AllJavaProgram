package Logical_prog;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		//armstrong number = 153 =addition of each no's cube is itself ie same no
		//1^3+5^3+3^3=153
		int no,sum,reminder;
		
		System.out.println("Enter a number");
		Scanner SC=new Scanner(System.in);
		
		int number=SC.nextInt();
		no=number; //153  //223   //112
		
		for(sum=0;number>0;number=number/10) {
			reminder=number%10; 
			// remider=153/10=3      // reminder=223/10=3      // reminder = 112/10 =2
			// 15%10=5               // 22/10=2                // reminder 11/10=1
			// 1%10=1                // 2/10=1                 // reminder 1/10 =1
			// no =0                 // no=0                   
			sum=sum+reminder*reminder*reminder; 
			// sum = 0+3*3*3=27      //sum=0+3*3*3=27         // sum=0+2*2*2=8
			// sum=27+5*5*5=152      // sum = 27+2*2*2=35     // sum= 8+1*1*1=9
			// sum = 152+1*1*1=153    // sum = 35+2*2*2=43    // sum = 9+1*1*1=10
		}
		if(sum==no) { // 153==153 true    //223==43 false   //112==10 false
			System.out.println("Armstron number");
		}
		else {
			System.out.println("Not armstrong number");
		}
	}

}
