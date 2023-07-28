
package Array_practice;

public class String_reverse {

	public static void main(String[] args) {
		
		String S1="Sampada Dattaram Ghadashi";
	
		String S2[]=S1.split(" ");
		
		
		for(int i=0;i<S2.length;i++) {
			  String S3=S2[i];
		
			
			for(int j=S3.length()-1;j>=0;j--){
			
				System.out.print(S3.charAt(j));
			}
		}
	}
}
