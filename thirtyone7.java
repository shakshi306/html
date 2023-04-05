package tutttts;
import java.util.Scanner;

public class thirtyone7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;double s=0;
		//int x=1,y=1;
		Scanner to= new Scanner(System.in);
		int n;
		System.out.println("enter the no.");
		n=to.nextInt();
				
		while(a<=n) {
			System.out.println("value of a"+a);
			s=s+Math.pow(a,a);
			a=a+1;
			System.out.println("sum:"+s);
		}
		

	}

}
