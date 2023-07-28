package interview4;

public class String_method {

	public static void main(String[] args) {
		
		//1 charAt
		String S1="Sampada";
		System.out.println(S1.charAt(5));
		
		//2 length
		System.out.println(S1.length());
		
		//3 .equals
		
		String S2="Sampada";
		String S3="Automation";
		
		System.out.println(S1==S2);  //True
		System.out.println(S1.equals(S2));  // True
		System.out.println(S2.equals(S3));   //FAlse
		
		//4.Index Of char
		
		String S4 ="Sampada";
		System.out.println(S4.indexOf('a'));  //1
		System.out.println(S4.indexOf('a',S4.indexOf('a')+1)); // 2nd occurance of a =4
		System.out.println(S4.indexOf('a',S4.indexOf('a',S4.indexOf('a')+1)+1));  // 3 rd occurance of a =6
		
		
		//5 Trim 
		String S5="    Sampada Dattaram ghadashi     ";
		//System.out.println(S5.trim());  // remove the space 
		System.out.println(S5);
		
	 // 6.replace
		System.out.println(S4.replace('a', 'w'));  //Swmpwdw+
	}
}
