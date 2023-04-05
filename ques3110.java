package tutttts;
import java.util.Scanner;

public class ques3110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner qu=	new Scanner(System.in);
	int n;
	System.out.println("Enter the no.=");
	n=qu.nextInt();
	double s=1.0;
	int a=1;
	while(a<=n) {
		System.out.println("value of a="+a);
		s=s+a/(a+1.0);
		a=a+2;
		System.out.println("sum="+s);
		
	}

	}

}
