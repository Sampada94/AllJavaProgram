package Practice;

public class loopstatement {
public static void main(String[] args) {
	
	// 1 for loop
	
	for(int i = 1;i<=10;i++) {
		System.out.println(i);
	}
	System.out.println("Loop completed");
	for(int j = 10;j>=1;j--) {
		System.out.println(j);
	}
	System.out.println("Loop completed");
	for(int k = 2;k<=20;k=k+2) {
		System.out.println(k);
	}
	System.out.println("Loop completed");
	for(int A = 1;A<=20;A=A+2) {
		System.out.println(A);
	}
	System.out.println("Loop completed");
	int sum = 0;
	for(int B = 1;B<=100;B++) {
		sum=sum+B;
	}
	System.out.println("Addition of 1 to 100 nos is = "+sum);
	
	System.out.println("  ");
	int no = 8;
	for(int s = 1;s<=10;s++) {
		System.out.println(no*s);
	}
	
	for(int z = 1;z<=100;z++) {
	
		System.out.println("Sampada");
	}
	
}

}
