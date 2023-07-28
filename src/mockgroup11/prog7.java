package mockgroup11;

public class prog7 {
 public static void main(String[] args) {
	prog7.A1(1, "Sampada");
	 prog7.A1(2,"Divya");
	 
	 prog7 Obj = new prog7();
	 Obj.A2(3,"Niyati");
	 
	 prog7.A3("Sampada", 10, 'A', 93.91f);
}
 public static void A1(int no,String name) {
	 System.out.println(+no+" "+name);
 }
 public void A2(int no,String name) {
	 System.out.println(+no+" "+name);
 }
 
 public static void A3(String name,int Rollno,char grade,float percentage) {
	 System.out.println("Student Name = "+name+"  "+Rollno+"  "+grade+"  "+percentage);
 }
}