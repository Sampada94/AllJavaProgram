package mockgroup11;

public class Duplicate {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,2,5,6};
		//1 2 3
		for(int i=0;i<arr.length;i++) {
			//2 3 4 2
			for(int j=i+1;j<arr.length;j++) {
				//1==2 =f 1==3=f 1==4
				//3 ==2 2==4 2==2
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
