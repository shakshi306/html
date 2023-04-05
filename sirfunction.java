package tutttts;
import java.util.Scanner;
public class sirfunction {

	
		public static void showTable() {
			Scanner input = new Scanner(System.in);
			int n;
			System.out.println("enter the value");
			n=input.nextInt();
		    showTable(n);
		}
		
		public static void showTable(int n) {
			for(int i=1;i<=10;i++)
				System.out.println(n + " * " + i + " = " + n*i);
			
		}
		
		public static int big(int x,int y )
		{
			if(x>y)
				return x;
			return y;
		}
		
		public static int big(int x,int y,int z)
		{
			return big(big(x,y),z);
		}
		
		public static boolean isPrime(int t)
		{
			t=Math.abs(t);  // if(t<0) t=-t;
			for(int i=2;i<t;i++)
				if(t%i==0)
					return false;
			return true;
		}
		public static void main(String[] args) {
			showTable();
			int a,b,c;
			Scanner input = new Scanner(System.in);
			System.out.println("enter the first value");
			a=input.nextInt();
			System.out.println("enter the second no");
			b=input.nextInt();
			c=a+b;
			if(isPrime(c)==true) // if c is prime, display its table otherwise display table of bigger value between a and b
				showTable(c);
			else
				showTable(big(a,b));
			
			showTable(big(a,b,c));
			

			}
	

	}


