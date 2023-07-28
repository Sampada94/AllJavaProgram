package LoopStatement;

public class ForLoop6 {
public static void main(String[] args) {
	
	//wap of addition of 1st 20 nos
	
	int sum =0; // A  //0+1=1
	for(int i =1;i<=20;i++) {  // B 1 2 3...21 false
     sum = sum+i;// 0+1=1  1+2
     //1+2+3=4+5....+20+false =210
    
	}
	 System.out.println("Addition of 1st 20 nos is = "+sum);
	 
	 
	System.out.println("     ");
	int no =0; // 0
		for(int j =1;j<=10;j++) { // 1 2
			no= no+j; //0+1=1 // 1+2=3
			
		}
		System.out.println("Addition of 1st 10 nos is = "+no);
}

}
