package Array;

public class Array_table1 {

	public static void main(String[] args) {
	
		int arr[][]= {{1,2,3},{4,5,6},{6,7,8},{1,1,23}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
