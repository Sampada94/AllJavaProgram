package Practive_5_5;

public class Duplicate {

	public static void main(String[] args) {
		
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
