package Assignment;

public class Table9 {
	

	public static void main(String[] args) {
		
		// WAP of multiplication of table 9 using for loop
		
		int No = 9;
		for(int i = 1;i<=10;i++) {
		
			System.out.println(No*i);
		}
		
		
		
		// WAP of multiplication of table 9 using while loop
		System.out.println("    ");
		
		int No1 = 9;
		
		int i = 1;  
		while(i<=10) {
		
		System.out.println(No1+" * "+i+" = " + No1*i);
		i++;
		}
	}
}
