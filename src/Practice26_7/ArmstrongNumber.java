package Practice26_7;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int no,sum,rem;
		
		System.out.println("Enter a number"); //225
		
		Scanner Sc=new Scanner(System.in);
		int num=Sc.nextInt();
		
		no=num; //225
		
		for(sum=0;num>0;num=num/10) {   
			rem=num/10;   //225/10=22  rem=5    22/10=2 rem=2    2/10 =0 rem=2
			sum=sum+rem*rem*rem;  //0+125=125   125+2*2*2=133    133+8=141
			
		}
		if(no==sum) { // 225|=141
			System.out.println("Number is armstrong number");
		}
		else {
			System.out.println("Number is not a armstrong number");
		}
		
	}
}
