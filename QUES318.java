package tutttts;
import java.util.Scanner;
public class QUES318 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sccc=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=sccc.nextInt();
		int a=1;
		
		int fac=1;
//		fac=fac*a;
		double s =0;
		int x=0;
		while(a<n) {
		    fac=fac*a;
			System.out.println("value of a="+a);
			s=s+Math.pow(a,a)/fac;
			a=a+1;
			System.out.println("sum="+s);
		}


	}

}
