package Array_practice;

public class Duplicate {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,1,4,7,3,9,45,56,78,45,78};
		System.out.println(arr.length);
		
		//i0=1 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {   //j=i0+1=2 ,3
				if(arr[i]==arr[j]) {  //1==2=false 1==3=false
					System.out.println(arr[j]);
				}
			}
		}
		
	}
}
