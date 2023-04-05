package tutttts;
import java.util.Scanner;

public class digitno4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner no=new Scanner(System.in);
		int n=3865;
		int a,b,c,d;
		a=n%10;
		n=n/10;
		System.out.println("the value of a = "+a);
		b=n%10;
		n=n/10;
		System.out.println("the value of b = "+b);
		c=n%10;
		n=n/10;
		System.out.println("the value of c = "+c);
		d=n%10;
		n=n/10;
		System.out.println("the value of d = "+d);
		int sum=a+b+c+d;
		System.out.println("sum of no. is:"+sum);
		int rev=a*1000+b*100+c*10+d;
		System.out.println("rev. no."+rev);
		

	}

}
