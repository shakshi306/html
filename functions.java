package tutttts;
import java.util.Scanner;
public class functions {
public static void showtable()
{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter no.");
	n=sc.nextInt();
	for(int i=1;i<=10;i++)
		System.out.println(n+"x"+i+"="+n*i);
	
}
//any variable declare in function is local var
public static void showtable(int n) // upr vle n da is n nl koi link ni 

{
	for(int i=1;i<=10;i++)
		System.out.println(n+"x"+i+"="+n*i);
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		showtable();//ee frst vla void chlayega wthout parameter
		System.out.println("enter the first value=");
		a=sc.nextInt();
		System.out.println("enter the second value=");
		b=sc.nextInt();
		c=a+b;
		showtable(c);// ee second vla void chlayega wth parameters 
		

	}

}
