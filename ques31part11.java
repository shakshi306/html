package tutttts;
import java.util.Scanner;

   public class ques31part11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scc=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=scc.nextInt();
		int a=1;
		
		int fac=1;
		double s =1;
		double x=1.0;
		
		
		while(a<=n) {
			fac=fac*a;
			System.out.println("value of a="+a);
			s=s+Math.pow(x,a)/fac;
      		a=a+1;
			
			System.out.println("sum="+s); 
		}



	}

}
