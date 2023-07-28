package Array_practice;

public class odd {

	public static void main(String[] args) {
		int arr[]= {11,12,23,34,45,56,67,78};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}
}
