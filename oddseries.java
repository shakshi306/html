package tutttts;
import java.util.Scanner;

public class oddseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,s=0;
		Scanner os= new Scanner(System.in);
		int n;
		System.out.println("enter the no.");
		n=os.nextInt();
		while(a<=n) {
			System.out.println(a);
			s=s+a;
			a=a+2;
		}
		System.out.println("sum is:"+s);
			
		}


	

}
