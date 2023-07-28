package Array;

import java.util.Arrays;

public class Array_Multiple {

	public static void main(String[] args) {
		
		String S1[]= new String[3];  // Row
		String S2[][]= new String[3][5];  // Column
		
		System.out.println(S2[2].length);
		
		// 1st row
		S2[0][0]="A1";
		S2[0][1]="A2";
		S2[0][2]="A3";
		S2[0][3]="A4";
		S2[0][4]="A5";
		
		System.out.print(S2[0][0]+" ");
		System.out.print(S2[0][1]+" ");
		System.out.print(S2[0][2]+" ");
		System.out.print(S2[0][3]+" ");
		System.out.println(S2[0][4]+" ");
		
		// 2nd row
		S2[1][0]="B1";
		S2[1][1]="B2";
		S2[1][2]="B3";
		S2[1][3]="B4";
		S2[1][4]="B5";
		
		System.out.print(S2[1][0]+" ");
		System.out.print(S2[1][1]+" ");
		System.out.print(S2[1][2]+" ");
		System.out.print(S2[1][3]+" ");
		System.out.println(S2[1][4]+" ");
		
		//3 rd row
		S2[2][0]="C1";
		S2[2][1]="C2";
		S2[2][2]="C3";
		S2[2][3]="C4";
		S2[2][4]="C5";
		
		System.out.print(S2[2][0]+" ");
		System.out.print(S2[2][1]+" ");
		System.out.print(S2[2][2]+" ");
		System.out.print(S2[2][3]+" ");
		System.out.println(S2[2][4]+" ");
		
		System.out.println();
		
		for(int row = 0;row<S2.length;row++) {
			for(int col=0;col<S2[2].length;col++) {
				System.out.print(S2[row][col]+" ");
			
			}
			System.out.println();
		}
	}
}
