package program;

public class primitivedatatype {  // numeric and nondecimal

	public static void main (String []args) {
		
	// 1. Byte data type = 1 byte = 8 bit = -128 to 127 
	//	Syntax = DataType VariableName = value;
		
		// Variable declaration rule
		// must not begin with digit
		// should not be with keyword
		// white space is not allowed
		
		byte b = 80;
		byte b1= 127;              // max limit
		byte b2 = -128;            // min limit
	//	byte b3 = 128 ;  not allowed 
		
		System.out.println("byte data type ==> " +b );
		System.out.println("byte data type max limit ==> " +b1);
		System.out.println("byte data type min limit ==> " +b2);
		 System.out.println("                                   "); 
		System.out.println("*********************************");
		System.out.println("              ");
		
		
	// 2.Short data type =2 byte= 16 bit = -32768 to 32767 
		
		short s = 100;
		short s1 = 32767;    // max limit 
		short s2 = -32768;   // min limit
		System.out.println("Short data type ==> "+s);
		System.out.println("Short data type Max limit ==> "+s1);
		System.out.println("Short data type Min limit ==> "+s2);
		 System.out.println("                                   "); 
		System.out.println("**********************************");
		System.out.println("                                   ");
		
		//3. Integer data type = 4 byte = 32 bit = -2147483648 to 2147483647
		
		int i = 120;
		int i1 = 32767;
		int i2 = 2147483647;
		System.out.println("Integer data type ==> "+i);
		System.out.println("Integer data type ==> "+i1);
		System.out.println("Integer data type Max type ==> "+i2);
		 System.out.println("                                   "); 
		System.out.println("**********************************");
		System.out.println("                                   ");
		
		// 4. long data type =8 byte = 64 bit 
		
		 long l = 327689;
		 long l1 =922337200;
	     System.out.println("long data type ==> "+l);
		 System.out.println("long data type ==> "+l1);
		 System.out.println("                                   "); 
		 System.out.println("**********************************");
		 System.out.println("                                   ");
		
		
		// Primitive and decimal
		 // 5. Float = 4 byte = 32 bit // variable ddecimal and inint 
		 
		 float f = 54.5f;
		 float f1 = 44;
		 float f2 = -55.666f;
		 System.out.println("float data type f ==> "+f);
		 System.out.println("float data type f1 ==> "+f1);
		 System.out.println("float data type f2 ==> "+f2) ;
		 System.out.println("                                   "); 
		 System.out.println("**********************************");
		 System.out.println("                                   ");
		 
		 // we can stored int value in int float data type 
		 // 6. Double data type = 8 Byte = 64 Bit
		 
		 double d = 555;
		 double d1 = 55555.56d;
		 double d2 = 78945.36;
		 double d3 = -45687.65;
		 System.out.println("Double data type d ==> "+d);
		 System.out.println("float data type d1 ==> "+d1);
		 System.out.println("float data type d2 ==> "+d2) ;
		 System.out.println("float data type d3 ==> "+d3) ;
		 System.out.println("                                   "); 
		 System.out.println("**********************************");
		 System.out.println("                                   ");
		 
		 // 7. Character data type = 2 byte= 16bit
		 char c ='A';   // char c= 'AB'+++;   not allowed
		 char c1 = '2';
		 char c2 = '$';
		 char c3 = '+';  // char c4='++'; not allowed
		 System.out.println("Char data type c ==> "+c);
		 System.out.println("Char data type c1 ==> "+c1);
		 System.out.println("Char data type c2 ==> "+c2) ;
		 System.out.println("Char data type c3 ==> "+c3) ;
		 System.out.println("                                   "); 
		 System.out.println("**********************************");
		 System.out.println("                                   "); 
		 
		 // 8. Boolean data type = 1 byte = 8 bit 
		 boolean B5 = true ;
		 boolean B6 = false;
		 System.out.println("Boolean data type B5 ==> "+B5) ;
		 System.out.println("Boolean data type B6 ==> "+B6) ;
		 System.out.println("                                   "); 
		 System.out.println("**********************************");
		 System.out.println("                                   "); 
		 
		 
		 
		 
		 
		 
		 
		 
 
		 
	}
}
