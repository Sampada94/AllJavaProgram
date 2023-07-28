package String_StringBuffer;

public class Pro1 {

	public static void main(String[] args) {
		
		String S1=new String ("Java");  //heap
		String S2="Java1";   // scp
		
		StringBuffer SB=new StringBuffer("Java");  //heap
	//	StringBuffer Sb1="Java1";
		
		System.out.println(SB.reverse());  //avaJ
		
		for(int i=S1.length()-1;i>=0;i--) {
			System.out.println();
		}
	}

}
