package LoopStatement;

public class LoopConcept {
public static void main(String[] args) {
	 
	// for (int i = 1;i<=10;i++) { // valid loop & finite
	//	System.out.println(i);
	//}
	
	// for (int i=1;true;i++) {         valid but infinite
	//	System.out.println(i);
	// }
	
	//for(int i = 1;false;i++) {   // Invalid
	//	System.out.println(i);
	//}
	
    	for(int i = 1,j=2,k=3;i<=20;i++) { // valid & finite
		System.out.println("hello");
	 }
	
	// for(String = Pune;s<=8;s++) {   // Invalid
	//	System.out.println("Hello");
	//}
	
//	 for(int i=1;i<=1;i++)  //  missing { = valid only for single line code
//	 System.out.println(i);	
	
	
	// for(;;) {      // valid & infinite
		// System.out.println("Hello");
	// }
	}
}


