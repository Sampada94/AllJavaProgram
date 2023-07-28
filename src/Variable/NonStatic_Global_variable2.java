package Variable;

public class NonStatic_Global_variable2 {
	
	String name = "Sampada"; // non static global variable
	// Non static variable declared from other class
	
public static void main(String[] args) {
	 
	//non static method  calling with nonstatic variable from differnt class
	// by creating object
	
	
	DifferntClass2 Obj=new DifferntClass2();
	System.out.println(Obj.RollNo);  // 25
	System.out.println(Obj.Name1);    // Radha
	
	
	// Non static method calling with static variable from differnt class
	// classname refvariable =new class name
	System.out.println(DifferntClass2.age);  // 20  static
	System.out.println(DifferntClass2.name);   
	
	// static differnt class 
	// System.out.println(classname.variablename);
	
	// nonstatic differnt differnt class 
	// System.out.println(refvarname.variablename);
	
	// static differ  class method 
	// classnmae.methodname();
	
	//nonstatic diff class method
	//object
	// refvarname.methodname();
	
	
	NonStatic_Global_variable2 RR=new NonStatic_Global_variable2();
	RR.A1();  // 23 Ak
	System.out.println(RR.name); // Ak
	
	
}
public   void A1() {   // non static method - for this obj creation requird to print the statement
	   int i  = 23;     // local variable bcz declared inside the method
	name = "Ak";   // name1 not takesn as variable bcz its not declare in this program
	
	System.out.println(i);  
	System.out.println(name); 
	
	// in result only shoe the value which are given in this nonstatic method
}
}
