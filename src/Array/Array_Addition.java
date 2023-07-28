package Array;

public class Array_Addition {

	public static void main(String[] args) {
		         // 0 1 2 3 4 5 6 7
		int arr[]= {1,2,3,4,5,6,7,8};
		int sum = 0;
		System.out.println(arr.length);
		
		for(int i =0;i<arr.length;i++) {
			    //0+1
			   // 1+2
			  //3+4
			// 7+4
			// 11+5
			// 15+6
			// 21+7
			//28+8
			//36+..= false
			sum=sum+arr[i]; //1 3 7 11 15 21 28 36
			
		}
		System.out.println( "Addition is ="+sum); //36
	}
	
}
