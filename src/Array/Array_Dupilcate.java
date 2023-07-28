package Array;

public class Array_Dupilcate {

	public static void main(String[] args) {
		             //0 1 2 3  4  5  6 7
		int Number[]= {2,4,6,8,22,55,8,80,22};
		    
		for(int i=0;i<Number.length;i++) {  //4 6 8
			
			for(int j=i+1;j<Number.length;j++) {  //6 8 22 55 ..22    8 22 55 8
				if(Number[i]==Number[j]) {  //8==8
					System.out.println("Duplicate Number is = "+Number[j]);// 8
				}
			}
			
		}
		
	}
}
