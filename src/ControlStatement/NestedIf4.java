package ControlStatement;

public class NestedIf4 {

	public static void main(String[] args) {
		
		int A=100;
		int B=200;
		int C=300;
		
		if(A>B) {
			if(A>C) {
				System.out.println("A is gratest no");
			}
		}

		else if(B>C) {
			System.out.println("B is greates no");
		}
		else {
			System.out.println("C is greates no");
		}
	}

}
