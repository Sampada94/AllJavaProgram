package Accessmodifier;

public class Default1 {
 int RollNo = 25;
 
 public static void main(String[] args) {
	
	 Default1 D1 =new Default1();
	 D1.Demo1();
	 D1.Demo2();
	 
	 System.out.println(D1.RollNo);
	 
}
 void Demo1() {
	 System.out.println("default method 1");
 }
 void Demo2() {
	 System.out.println("default method 2");
 }
}
