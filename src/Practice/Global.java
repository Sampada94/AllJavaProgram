package Practice;

public class Global {
int i = 10;
String name = "Sampada";

static int j = 20;
static String name1 ="Akshay";

public static void main(String[] args) {
	Global Obj = new Global();
	
	System.out.println(Obj.i);
	 System.out.println(Obj.name);
	 Obj.A1();
	 
	 System.out.println(Global.j);
	 System.out.println(Global.name1);
	 
	 variablediff AS=new variablediff();
	 System.out.println(AS.b);     //1000 = variablediff program
	 
}

public void A1() {
	System.out.println("Hii");
}

}
