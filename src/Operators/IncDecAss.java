package Operators;

public class IncDecAss {

	// Increment & decrement & Assignment Operator
	
	public static void main(String[] args) {
		int A = 34;
		int B = 23;
		int C;
		
		C=A;
		System.out.println("C = "+C);
		
		A++;
		System.out.println("A++ "+A);
		B++;
		System.out.println("B++ "+B);
		
		C= C+1;
		System.out.println("C++ "+C);
		
		C--;
		System.out.println(C);
		
		C--;
		System.out.println(C);
		
		B--;
		System.out.println(B);
	}
}
