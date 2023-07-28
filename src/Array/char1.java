package Array;

import java.util.Arrays;

public class char1 {

	public static void main(String[] args) {
		
		char C2[]=new char[5];
		C2[0]='A';
		C2[1]='C';
		C2[2]='3';
		C2[3]='B';
		C2[4]='2';
		
	
		for(int j = 0;j<C2.length;j++) {
			System.out.println(C2[j]);  //A C 3 B 2
			
		}
		System.out.println();
		Arrays.sort(C2);
		for(int j = 0;j<C2.length;j++) {
			System.out.println(C2[j]); 
			
		}
	}

}