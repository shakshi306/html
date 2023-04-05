package tutttts;
import java.util.Scanner;

public class menu 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner me=new Scanner(System.in);
		System.out.println("Enter the num");
		int num;int a=0;int b=0;int c=0;
		num=me.nextInt();
		
		if(num==1)
		{
			System.out.println("Enter the value of a");	
			a=me.nextInt();
			
			System.out.println("Enter the value of b");
			b=me.nextInt();
			c=a+b;
			System.out.println("sum is"+c);
		}
			
		else if(num==2)
		{
         System.out.println("Enter the value of a");
			a=me.nextInt();
			if(a%2==0)
				System.out.println("it is even");
			else
				System.out.println("it is odd");
		}
		else if(num==3)
		{
         System.out.println("Enter the value of a");
			a=me.nextInt();
			c= ((a-32)*5)/9;
			System.out.println("temp.in celsius"+c);
		}
		else if(num==4)
		{
         System.out.println("Enter the value of a");
		    a=me.nextInt();
			System.out.println("Enter the value of b");
			b=me.nextInt();		
			c = (int)((a+b)/2);
			System.out.println("average of two no's"+c);
		}
		else 
			System.out.println("QUIT");	
		
	}
	
}
		
			
		




