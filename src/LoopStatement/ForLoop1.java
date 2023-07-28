package LoopStatement;

public class ForLoop1 {
public static void main(String[] args) {
	
	/*print 1 to 5 nos using for loop
	  Syntax = 
	  for(Initialization; Condition;Inc or dec ){
	   initialization = starting point = 1
	   condition = ending point = 5 
	   inc or dec = ++ or --
	   */
	// i=1 ; 1<=5 
	//2  ; 2<=5
	//3 ; 3<=5
	//4 ; 4<=5
	//5 ; 5=5
	//6 ; 6!=5  false
	for(int i=1; i<=5;i++) {
		System.out.print( " "+i); // for space " " +i ( ln not present
		//1
	}
	System.out.println(" ");
for(int j=1;j<=5;j++) {
	System.out.println(j);
}
for(int k=1;k<=5;k++) {
	System.out.print(k); // ln not present 
}
System.out.println(" ");
 for(int z= 1;z<=100;z++) {
	 System.out.println(z);
 }
 System.out.println(" ");
 for(int x=15;x<=50;x++) {
	 System.out.println(x);
 }
	 
}
}
