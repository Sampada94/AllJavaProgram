package Array;

public class Array_largestno {

	public static void main(String[] args) {
		           //0 1   2  3  4   5
		int arr[]= {25,50,75,99,400,222};
		int max = arr[0]; //25
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			// 25>50 25>75 25>99...25>222
			//50>75  50>99....50>222
			//400>222  true
			if(arr[i]>max) { // 400>222
				max=arr[i]; //400
				
			}
			
		}
		System.out.println(max);
	}
}
