package ControlStatement;

public class IfelseIfLadder1 {
	public static void main(String[] args) {
		
		int marks = 80;
		
		/*
		  If else if ladder 
		  syntax
		  if( condition1){
		  Statement 1 executed when condition1 is true
		  }
		  else if(condition2){
		  statement 2 executed when condition 2 is true
		  }
		  else if(condition3){
		  statement 3 executed when condition 3 is true
		  }
		  else{
		  statement4 ececuted if all above condition are false
		  }
		  
		 */
		
		if(marks >= 75) {
			System.out.println("Distnction");
		}
		else if (marks>=60) {
			System.out.println("First class");
		}
		else if(marks>=50) {
			System.out.println("Higher second class");
		}
		else if(marks>=35) {
			System.out.println("Second class");
		}
		else {
			System.out.println("Failed");
		}
	}
	
}
