package ControlStatement;

public class NestedIf2 {
	public static void main(String[] args) {
		
		/*Nested if control statement
		  Syntax = 
		   if(Condition1){
		   if(condition2){
		   Statement 1 ;
		   }
		   }
		   else if (condition3){
		   Statement2;
		   }
		   else{
		   statement3; 
		   }
		   */
		
		int A= 100;
		int B = 2000;
		int C = 300;
		
		if(A>B) {
			if(A>C) {
				System.out.println("A is a greatest no.");
			}
		}
		else if(C>B) {
			System.out.println("c is a greatest no.");
		}
		else {
			System.out.println("B is a greates no.");
		}
	}
	
}
