package ControlStatement;

public class leapyear {
public static void main(String[] args) {
	 
	// leap year - divisble by 4 & 4000 
	// not divisble by 100
	
	int Year = 2023;
	
	if(((Year%4==0)&&(Year%100 !=0))||(Year%4000==0)){
		System.out.println("Given year is a leap Year");
	}
	else {
		System.out.println("Given year is not a leap Year");
	}
}
}
