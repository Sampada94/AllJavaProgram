package Practice26_7;

public class Fibonaccis_serie {

	public static void main(String[] args) {
		
		int a=-1,b=1,c;
		for(int i=0;i<10;i++) { //0  1  2  3 4 5
			c=a+b; //c=-1+1=0  c=1+0=1  c=0+1=1  c=2 c=3  c=5  c=8  c=13
			System.out.println(c);  //0 1 1  2 3 5 8 13
			a=b; //a=1    0  1  1  2  3 5
			b=c; //b=0    1  1  2  3  5 8
		}
	}
}
