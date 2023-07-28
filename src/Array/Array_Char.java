package Array;

import java.util.Arrays;

public class Array_Char {

	public static void main(String[] args) {
		
		char C1[]=new char[5];
		
		C1[0]='A';
		C1[1]='B';
		C1[2]='C';
		C1[3]='D';
		C1[4]='E';
		//C1[5]='F';  //Index 5 out of bounds for length 5
		
		char C2[]=new char[5];
		C2[0]='A';
		C2[1]='D';
		C2[2]='C';
		C2[3]='B';
		C2[4]='E';  
		
		char C3[]=new char[5];
		C3[0]='2';
		C3[1]='1';
		C3[2]='4';
		C3[3]='5';
		C3[4]='3';
		
		System.out.println();
		
		for(int i = 0;i<C1.length;i++) {
			System.out.println(C1[i]);
			Arrays.sort(C1);
		}
		System.out.println();
		
		Arrays.sort(C2);
		for(int j = 0;j<C2.length;j++) {
			System.out.println(C2[j]);
			
		}
		Arrays.sort(C3);
		System.out.println();
		for(int k = 0;k<C3.length;k++) {
			System.out.println(C3[k]);
			
		
	}
}
}
