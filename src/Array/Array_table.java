package Array;

public class Array_table {

	public static void main(String[] args) {
		//4*3  4 row =bracket 3 col =value
		// int arr []= {4,5,6}; //3
		int no[][]= {{1,2,3},{4,5,6},{7,8,9},{11,12,13}};
		
		System.out.println(no.length); //row
		System.out.println(no[0].length);  //col
		
		System.out.println(no[1][2]); //6
		System.out.println(no[2][2]);  // 9
		
		for(int i=0;i<no.length;i++) {
			for(int j=0;j<no[0].length;j++) {
				System.out.print(no[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
