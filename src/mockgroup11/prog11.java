package mockgroup11;

public class prog11 {
	int No =78;  //nonstatic global variable
	
public static void main(String[] args) {
	int i = 23; // nonstatic local variable
	System.out.println(i);
	
	// classname.methodname();
	prog11.A1();
	
	// classname refvarname=new classname
	prog11 RR = new prog11();
	RR.A2();
	differnet Obj = new differnet();
	System.out.println(Obj.Rollno); // nonstaic variable
	System.out.println(differnet.Rollno); //static varible
	
	System.out.println(RR.No);
}
	
public static void A1() {
	int No = 56;
	System.out.println(No);
}
public void A2() {
	int Z =89;
	System.out.println(Z);
}
}
