package mockgroup11;

import java.util.Arrays;

public class Logical_prog {

	public static void main(String[] args) {
		
	// reverse array
	//			int arr[]= {2,4,5,6,7,8,9,11,67,45,34,98};
	//			System.out.println("Size = "+arr.length);
	//			
	//			Arrays.sort(arr);
	//			for(int i=arr.length-1;i>=0;i--) {
	//				System.out.println(arr[i]);
	//			}
	//			System.out.println( );
				// String reverse
				
				String S1="Automation Java Ruby Python";
				// ip = Python ruby Java Automation
				
				String S2[]=S1.split(" ");
				
				for(int j=S2.length-1;j>=0;j--) {
					System.out.println(S2[j]);
				}
				
				
				

	}

}
