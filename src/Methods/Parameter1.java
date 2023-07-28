package Methods;

public class Parameter1 {
public static void main(String[] args) {
	Parameter1.Studentname("Sampada");
	Parameter1.Studentinfo("sampada", 8);
	
	Parameter1.Info("Sampada", "Ghadashi", 'A');
	
	Parameter1.Info1("Sampada", 8 ,92.91f,'A');
	
}
public static void Studentname(String Name) {
	System.out.println( Name);
}
public static void Studentinfo(String name , int Rollno) {
	System.out.println("Student Info = "+name+"  "+Rollno);
	

}
public static void Info(String name , String sirname ,char Grade ) {
	System.out.println("Student Info = "+name+" "+sirname+" "+Grade);
}
public static void Info1(String name, int Rollno,float Percentage, char Grade) {
	System.out.println("Student Name = "+name+" "+ "Student RollNo = "+Rollno+" "
+"Student Percentage = "+Percentage+" "+"Student Grade = "+Grade);
}
}
