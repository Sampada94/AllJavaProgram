package ControlStatement;

public class NestedIf3 {
public static void main(String[] args) {
	
	// Blood dontation
	
	int Age = 25;
	int Weight =39;
	
	if(Age>=18) {
		if(Weight>=40) {
			System.out.println("You are eligible for blood donation");
		}
		else if(Weight<=40){
			System.out.println("You are not eligible for blood donation");
	}
		else {
			System.out.println("Age or weight must be in ratio");
		
		}
	}
	
	// second way
	int A = 25;
	int W = 39;
	
	if((A>=18)&&(W>=40)) {
		System.out.println("You are eligible for blood donation");
	}
	else {
		System.out.println("You are not eligible for blood donation");
	}
}
}
