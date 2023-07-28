package Logical_prog;

public class Star_Diamond {

	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) { //1
			for(int j=1;j<=5;j++) {  
				if((j>=6-i) &&( j<=4+i)){   // f && t = T
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
