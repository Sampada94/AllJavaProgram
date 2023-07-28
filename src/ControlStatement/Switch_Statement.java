package ControlStatement;

public class Switch_Statement {

	public static void main(String[] args) {
		
//		switch(expression){
//		case value 1:
//			code to be executed 1
//		case value2:
//			code to be executed2
//		case value3:
//			code to be executed 3
	    
//	    default:
//	    	code to be executed if above all cases are false
//       }
		
		// 1. there can be 1 or n no of case value
		// 2. case value shuld be unique .If its duplicate the it retend compile time error
		// 3. case value must be switch expression only.it must be literal or constant
		// 4. Java switch expression must be short int long enums type , string 
		// 5. case vaue can have default lable which is optional
		// 6. each case statement have break statement which is optional.
		
		int no =100;
		switch(no) {
		
		case 10:
			System.out.println("Matched with 10");
			break;   // optional
			
		case 20:
			System.out.println("Matched with 20");
			break;   // optional
			
		case 100:
			System.out.println("Matched with 100");
			break;    // optional
			
			default:
				System.out.println("no matched");
		}
	}

}
