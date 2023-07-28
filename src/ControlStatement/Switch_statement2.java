package ControlStatement;

public class Switch_statement2 {

	public static void main(String[] args) {
		
		char letter='A';
		switch(letter) {
		case 'S':
			System.out.println("Matched with S");
			break;
			
		case'A':
			System.out.println("Matched with A");
			break;
			
		case 'M':
			System.out.println("Matched with M");
			break;
			
		case'D':
			System.out.println("Matched with D");
			break;
			
			default:
				System.out.println("No matched found");
			
		}

	}

}
