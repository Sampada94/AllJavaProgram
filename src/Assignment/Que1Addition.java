package Assignment;

public class Que1Addition {
	public static void main(String[] args) {
		
		// WAP to calculate sum of 1st 15 nos. using for loop

	  int sum= 0;
	  
		for(int i =1;i<=15;i++) {
			
			sum=sum+i;
			
		}
		System.out.println("Sum of 1 to 15 Nos is = "+sum);
		
		System.out.println("   ");
		
		
		//  WAP to calculate sum of 1st 15 nos. using while loop
		
		int Add=0;
		int i = 0;
		while(i<=15) {
			Add=Add+i;
			i++;
			}
	    
		System.out.println("Sum of 1 to 15 Nos is = "+Add);

	}
	
}
