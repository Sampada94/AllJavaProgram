package Practive_5_5;

import java.util.Arrays;

public class reveres_string {

	public static void main(String[] args) {
		
		String  S1="Sampada Dattaram Ghadashi";   //0p==ghadashi dattaram sampada
		String S2[]=S1.split(" ");
		
		for(int i=S2.length-1;i>=0;i--) {
			System.out.println(S2[i]);
	}
		
		
		//o/p== adapmas marattad ihsadahg
		
		for(int j=0;j<S2.length;j++) {
			String S3=S2[j];
			for(int k=S3.length()-1;k>=0;k--) {
				System.out.print(S3.charAt(k));
			}
		}
		
		System.out.println();
		//o/p==ihsadahg maeattad adapmas
		
		for (int z=S1.length()-1;z>=0;z--) {
			System.out.println(S1.charAt(z));
		}
	}
}