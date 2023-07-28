package Array_practice;

public class String_to_array {

	public static void main(String[] args) {
		
		String S1="Sampada Dattaram dipika Ghadashi";
		
		String S2[] = S1.split(" ");
		
		for(int i=0;i<S2.length;i++) {
			System.out.println(S2[i]);
		}
		System.out.println();
		for(int j=S2.length-1;j>=0;j--) {
			System.out.println(S2[j]);
		}
	}		
}
