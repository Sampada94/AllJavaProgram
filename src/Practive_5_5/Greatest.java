package Practive_5_5;

public class Greatest {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6,7};
		int max =arr[0];
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println(max);
		
		int arr1[]= {58,89,45,68,21,75};
		int max1=arr[0];
		
		for(int k=0;k<arr1.length;k++) {
			if(arr1[k]>max1){
				max1=arr1[k];
			}
		}
		System.out.println(max1);	
	}
}
