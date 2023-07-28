package LoopStatement;

public class WhileLoop1 {
public static void main(String[] args) {
	
	/* While loop -WAP 1 to 10 nos.
	  Syntax= 
	  initialization ; starting point
	  while(condition){
	  Statement;
	  inc/dec;
	  }
	   */
 int i =1;
 while(i<=10) {
	 System.out.println(i);
	 i++;
	 
 }
System.out.println("Loop completed");

// 100 to 1 

int j = 100;
while(j>=1) {
	System.out.println(j);// 100  99  98
	j--; //99 98 
}
System.out.println("Loop completed");

// 5 table

int no =5; 
int A = 1;  // initialization
while(A<=10) { // 11=false
	
	System.out.println(no*A); // 5*1=5  5*2=10 5*3=15 20..50
	A++; //2 3 45  10  11
}

}
}
