package Practice_16_6;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int arr[]= {2,3,4,5,6,7,8};
		
//		int sum = 0;
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
			
//		}

//		System.out.println("sum = "+sum);
		

//reverse
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		
		
		// duplicate
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println(arr[j]);
//				}
//			}
//		}
		
		// highest no
//		int max = arr[0];
	
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
				
//			}
			
//		}
//		System.out.println(max);
		
		
		// 2nd highest
//		Arrays.sort(arr);
//		int max = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
		
//		System.out.println(arr[arr.length-2]);
		
		
		// smallest no
		
//		int min=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println(min);
		
		
		// 2nd smallest
		Arrays.sort(arr);
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				
			}
		}
		System.out.println(arr[arr.length-6]);
		
		
		
	}

}
