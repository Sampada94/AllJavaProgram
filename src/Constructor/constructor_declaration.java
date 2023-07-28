package Constructor;

public class constructor_declaration {
 // variable declaration
	
	String name;
    String lastname;
    String education;
    int mobno;
    
    public constructor_declaration(String name1,String lastname1,String education1,int mobno1) {
    	// variable Initialization
    	
    	name=name1;
    	lastname=lastname1;
    	education=education1;
    	mobno=mobno1;
    	
    	// onther way of variable initialization (by using this)
    	
  //  	public constructor_declaration(String name,String lastname,String education,int mobno) {
    //		this.name=name;
   //     	this.lastname=lastname;
    //    	this.education=education;
      //  	this.mobno=mobno;
    //	}
    	
    	
    	
    }
 public static void main(String[] args) {
	
	 constructor_declaration SS1=new constructor_declaration("Sampada","ghadashi","BE Electrical",932124141);
	 constructor_declaration SS2= new constructor_declaration("Prachi","Sawant","MBA",917237003);
	 
	 System.out.println(SS1.name+" "+SS1.lastname+" "+SS1.education+" "+SS1.mobno);
	 System.out.println(SS2.name+" "+SS2.lastname+" "+SS2.education+" "+SS2.mobno);
}
}
