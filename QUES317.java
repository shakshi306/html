package tutttts;
import java.util.Scanner;

public class QUES317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int a=1;
		double s =0;
		int x=0;
		while(a<n) {
			System.out.println("value of a="+a);
			s=s+x+Math.pow(a,a);
			a=a+1;
			System.out.println("sum="+s);
		}
		
	}

}
