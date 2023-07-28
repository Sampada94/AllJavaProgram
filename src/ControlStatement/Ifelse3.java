package ControlStatement;

public class Ifelse3 {
public static void main(String[] args) {
	String A ="sampada";
	String B ="sampada";   
	String X =" Java";
	String Y = "  Java";    // space between "  " will be same in both 
	
	if( A==B) {
		System.out.println(" A & B are equal");
	}
	else {
		System.out.println("A & B are not equal");
	}
	if( X==Y) {
		System.out.println("X & Y are equal");
	}
	else {
		System.out.println("X & Y are not equal"); // bcz of space this result will show
	}
}

}
