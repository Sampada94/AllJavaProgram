package Array_practice;

import java.util.Arrays;

public class second_largest {

	public static void main(String[] args) {
		
		int arr[]= {45,56,67,78,8,90,12};
		int max=arr[0];
		
		System.out.println(arr.length);
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]>max) {
					
					max=arr[i];		
			}
		}
		System.out.println(arr[arr.length-2]); 
}
}