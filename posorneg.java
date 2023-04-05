package tutttts;
import java.util.Scanner;

public class posorneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pn=new Scanner(System.in);
		int a;
		System.out.println("the value of a is:");
		a=pn.nextInt();
		if(a>=0)
		{
			System.out.println("it is pos.="+a);
			
		}
		else
			System.out.println("it is neg.="+a);
		

	}

}
