package mockgroup11;

public class Highest_Number {

	public static void main(String[] args) {
		
		int arr[]= {34,56,32,89,65,11,23,90};
		
		int max=arr[0];
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {  //34>56 =f
				max=arr[i];
				
			}
				
			
		}
		System.out.println(max);
		
	}

}
