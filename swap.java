package tutttts;
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sw=new Scanner(System.in);
		int a,b;
		int c;
		System.out.println("Enter the value of a:");
		a=sw.nextInt();
		System.out.println("Enter the value of b:");
		b=sw.nextInt();
		System.out.println("Enter the value of c:");
		c=sw.nextInt();
	    c=a;
	    a=b;
	    b=c;
	    System.out.println("the value of a:"+a);
	    System.out.println("the value of b:"+b);
	    System.out.println("the value of c:"+c);



		

	}

}
