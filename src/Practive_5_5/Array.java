package Practive_5_5;

import java.util.Arrays;

public class Array {

	//singlediamention array
	public static void main(String[] args) {
		
		//syntax = datatype arrayname[]=new datatype[sixe ofarray]

		int arr[]=new int[5]; // declaration
		
		arr[0]=10;   //initialization
		arr[1]=20;
		arr[3]=30;
		arr[4]=40;
		arr[2]=50;
		
		System.out.println(arr[3]);  //usages
		
		for(int i =0;i<arr.length;i++) {   //getting all array values use for loop
			System.out.println(arr[i]);
			Arrays.sort(arr);
		}
		
		char C1[]=new char[3];
		C1[0]='A';
		C1[1]='B';
		C1[2]='C';
		
		for(int j=0;j<C1.length;j++) {
			System.out.println(C1[j]);

		}
		
		String S1[]=new String[3];
		S1[0]="Sampada";
		S1[1]="Ghadashi";
		S1[2]="Java";
		for(int k=0;k<S1.length;k++) {
			System.out.println(S1[k]);
		}
		boolean B1[]=new boolean[3];
		B1[0]=true;
		B1[1]=false;
		B1[2]=true;
		for(int a=0;a<B1.length;a++) {
			System.out.println(B1[a]);
		}
		
		//Multidiamentional array
		
		int T1[]= {2,3,4,5,6,7,8};
		System.out.println(T1.length);
		for(int s=0;s<T1.length;s++) {
			System.out.println(T1[s]);
		}
		
		for(int x=T1.length-1;x>=0;x--) {  //reverse order array
			System.out.println(T1[x]);
		}
		//5 row*3 column
		int T2[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,16}};
		
		System.out.println("row length="+T2.length);  // row length =5
		
		System.out.println("column size="+T2[0].length);  //column size=3
		
		for(int y=0;y<T2.length;y++) {
			for(int z=0;z<T2[0].length;z++) {
				System.out.print(T2[y][z]);
			}
			System.out.println();
		}
		// 2 row * 5 column
		int arr1[][]= {{1,2,3,4,5},{6,7,8,9,10}};
		System.out.println(arr1.length);  //row size=2
		System.out.println(arr1[0].length);  //column size=5
		for(int p=0;p<arr1.length;p++) {
			for(int q=0;q<arr1[0].length;q++) {
				System.out.print(arr1[p][q]);
			}
			System.out.println();
		}
		
		int arr2[]= {1,2,3,4,5,3,66,78,3};
		System.out.println(arr2.length);
		
		for(int w=0;w<arr2.length;w++) {
			for(int e=w+1;e<arr2.length;e++) {
				if(arr2[w]==arr2[e]) {
					System.out.println(arr2[e]);
				}
			}
		}
		

		
		
		
		
		
		
		
		
		
	}
}
