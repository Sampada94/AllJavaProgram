package Methods;

public class Parameter2 {
public static void main(String[] args) {
	
	Parameter2.Studentinfo("Sampada","Ghadashi",8,'A',93.92f);
	
}
public static void Studentinfo(String Name,String Sirname,int Rollno,char Grade , float Percentage) {
	System.out.println("Student Name = "+Name+"  "+"Student sirname = " +Sirname+" "+"Student Rollno = "+Rollno+" "
			+"Student Grade = "+Grade+" "+"Student Percentage = "+Percentage);
}
}
