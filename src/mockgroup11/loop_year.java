package mockgroup11;

public class loop_year {
public static void main(String[] args) {
	
	int year = 2000;
	if(((year%4==0)&&(year%100!=0))||(year%4000==0)) {
		System.out.println("Given year is leap year");
	}
	else{
		System.out.println("Given year is not leap year");
	}
}
}
