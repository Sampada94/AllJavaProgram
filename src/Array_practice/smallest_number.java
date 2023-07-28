package Array_practice;

public class smallest_number {

	public static void main(String[] args) {
		
		int arr[]= {11,23,34,4,5,56,2,55};
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
