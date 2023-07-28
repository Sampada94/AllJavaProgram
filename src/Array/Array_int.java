package Array;

public class Array_int {

	public static void main(String[] args) {
		int No = 100;
		System.out.println(No);  //100
		System.out.println();
		// Array is a collection of similar type of elements/values
		//we can stored fix set of element in java array
		//Array is the index based 
		//1st element of Array = 0 
		//last element of array = n-1(ie array name)
		
		//1 Array Declaration
		
		//Syntax = datatype arrayname []= new datatype[sixe of array];
		
		int arr[]=new int[10];
		
		//2. Array Initialization 
		
		//syntax = arayname[indexnumber]= value;
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		arr[7]=80;
		arr[8]=90;
		arr[9]=100;
		
		//arr[11]=200;  //Index 11 out of bounds for length 10
		
		
		//if we dont know the lenght of array then
		System.out.println("length of array = "+ arr.length); // 10
		
		System.out.println();
		//Usages 
		
		//syntax - System.out.println(arraname[indexnumber];
		
		System.out.println("Index 0 value =  "+arr[0]);  //10
		System.out.println("Index 2 value =  "+arr[2]);  //30
		System.out.println("Index 9 value =  "+arr[9]);  //100
		
		/// System.out.println(arr[11]); //Index 11 out of bounds for length 10
		
		System.out.println();
		
		//for printing all the array value ,use for loop
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
}
