package Assignment;

public class Leapyear {
public static void main(String[] args) {
	
	// WAP to check given year is leap year by using if else
	
int Year = 2024;
	
	if(((Year%4==0)&&(Year%100 !=0))||(Year%4000==0)){
		System.out.println("Given year is a leap Year");
	}
	else {
		System.out.println("Given year is not a leap Year");
	}
	
	
	// WAP to check given year is leap year by using if else if ladder
	
	int year = 1994;
	if(year%4==0) {
		System.out.println("Given year is a leap Year");
	}
	else if (year%100!=0) {
		System.out.println("Given year is not a leap Year");
	}
	else if (year%4000==0) {
		System.out.println("Given year is a leap Year");
	}

	else {
		System.out.println("Given year is not a leap Year");	
	}
	
}
}