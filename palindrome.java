package tutttts;
import java.util.Scanner;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		int s=0;
		Scanner rn= new Scanner(System.in);
		int n;
	
		System.out.println("enter the no.");
		n=rn.nextInt();
		int t=n;
		while(n!=0) {
			int d=n%10;
			System.out.println("value of d="+d);
			s=s+d;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println("sum of digits="+s);
		System.out.println("rev of no.="+rev);
		if(rev==t) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
			
		}
	}
}
