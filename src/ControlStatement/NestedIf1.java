package ControlStatement;

public class NestedIf1 {
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
	
	//int A= 340;
	//int B = 200;
	//int C = 990;
	
	//int A = 500;
	//int B = 800;
	//int C= 300;
	
	int A= 1000;
	int B=700;
	int C = 500;
	
	if(B>A) {
		if(B>C) {
			System.out.println("B is a greatest no.");
		}
	}
	else if(A>C) {
		System.out.println("A is a greates no.");
	}
	else {
		System.out.println("C is a greates no.");
	}
}
}
