package Logical_prog;

public class Fibonaccis_series1 {

	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13 21 34 
				// Fibonaccis_series = next no is sum of previous two nos
			
				int a =-1,b=1,c; // (1 0) (0 1) (1,2)(2,3)
				for(int i =0;i<10;i++) {
					c = a+b;   
				//      -1+1=0
				//	     1+0=1
				//	     1+1=2
				//	     1+2=3
				//	     2+3=5
					System.out.println(c); //  0 1 2 3 5
					a=b; //1 0 1 1 2 3
					b=c;// 0 1 1 2 3 5 
					
				}

	}

}
