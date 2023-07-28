package Array_practice;

import java.util.Arrays;

public class Second_smallest {

	public static void main(String[] args) {
		
		int arr[]= {2,4,56,100,7,8,9};
		
		int min=arr[0];
		System.out.println(arr.length);// 7         // 0    1 2 3 4 5 6
		Arrays.sort(arr);                           // 100 56 9 8 7 4 2
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.println(arr[arr.length-6]); 
	}

}
