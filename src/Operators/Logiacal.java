package Operators;

public class Logiacal {
 public static void main(String[] args) {
	
	 boolean A = false; //0
	 boolean B = false; // 0
	  System.out.println(A&&B);  // 0 && 0 = 0 = false
	 System.out.println(A||B);  // 0 || 0 = 1 = False
	 
	 boolean A1 = false;
	 boolean B1 = true;
	 System.out.println(A1&&B1); // 0&&0 =0 False
	 System.out.println(A1||B1);  // 0||1=1 True
	 
	 boolean A2 = true; //1
	 boolean B2 = false; // 0
	  System.out.println(A2&&B2);  // 1 && 0 = 0 = false
	 System.out.println(A2||B2);  // 1 || 0 = 1 = True
	 
	 boolean A3 = true; //1
	 boolean B3 = true; // 1
	  System.out.println(A3&&B3);  // 1 && 1 = 1 =  True
	 System.out.println(A3||B3);  // 1 || 1 = 1 = True
	 
	 
}
}