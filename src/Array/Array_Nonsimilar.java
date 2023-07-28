package Array;

import java.util.Arrays;

public class Array_Nonsimilar {

	public static void main(String[] args) {
		//Object obj = new Object[sixe of array];
		
		Object obj []=new Object[6];
		obj[0]=10;
		obj[1]="Sampada";
		obj[2]='A';
		obj[3]=33.33d;
		obj[4]=true;
		obj[5]= 987654555555l;
		
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		
		}
	}
}
