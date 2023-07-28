package Practive_5_5;

public class Array1 {

	public static void main(String[] args) {
		
		//table
		
		int arr[][]= {{1,2,3},{1,2,3},{1,2,3},{4,5,6},{7,8,9}};   //row =5 col =3
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
