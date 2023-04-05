package tutttts;
import java.util.Scanner;
public class naturalno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nn=new Scanner(System.in);
		int s=0,a=1;
				int n=100;
		while(a<=n) 
		{
			System.out.println(a);
			s=s+a;
			a=a+1;
		}
		System.out.println("sum is:"+s);
	}

}
