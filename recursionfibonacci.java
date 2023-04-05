package tutttts;
import java.util.Scanner;
public class recursionfibonacci {
	public static int fib(int n) {
		if(n<2)
			return n;
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("enter the no.");
		n=sc.nextInt();
		int k;
		//k=fib(6);
		k=fib(n);
		System.out.println( "n term is:"+ k);

	}

}
