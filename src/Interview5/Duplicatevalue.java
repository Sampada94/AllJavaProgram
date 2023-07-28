package Interview5;

public class Duplicatevalue {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,4,7};
		//2  3 4
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {//3 4 5
				if(arr[i]==arr[j]) { //2==3 2==4 2==7 4==5 =false 4==4
					System.out.println("Duplicate value = "+arr[j]);
				}
			}
		}

	}

}
