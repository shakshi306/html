package tutttts;
import java.util.Scanner;

public class recfiprocalseries {
	public static void main(String[] args) {

		
		
		int a=1;
double s=0.5;
Scanner rp= new Scanner(System.in);
int n;
System.out.println("enter the no.");
n=rp.nextInt();
		
		
		while(a<=n)
		{   
		System.out.println("value of a="+a);
		s=s+a/s; //(1/0.5=2+0.5=2.5)
		a=a+1;
		System.out.println("sum is="+s);

		
		}	
		
	}
	


}
	
