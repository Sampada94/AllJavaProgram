package Array;

public class Array_Reverse {

	public static void main(String[] args) {
		//datatype arrayname []={};
		int arr[]= {2,55,444,555,899};
		
		System.out.println(arr.length);
		System.out.println();
		
		for(int j = 0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		System.out.println();
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		
		}
	}
}
