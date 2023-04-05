package tutttts;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fa= new Scanner(System.in);
		int n;
		System.out.println("enter the no.");
		n=fa.nextInt();
		int a=1,fac=1;
		while(a<=n) {
			
	       	fac=fac*a;
	       	//or n*fact(n-1)
	       	System.out.println("a is "+a+" and fac is "+fac);
	       	//n=fac*fac;
	       	
			a=a+1;
		}
		
		System.out.println("fac="+fac);

		}
}
