package tutttts;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n;
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("how many values you want to enter");
		n=sc.nextInt();
		a=new int[5];
		System.out.println("enter the 5 values"+n);
		int s=0;
		for(i=0;i<5;i++) 
		{
			a[i]=sc.nextInt();
			//System.out.println("values you entred are:");
			
		}
		for(i=0;i<5;i++) 
		{
			//int s=0;
			System.out.println("values you entred are:"+a[i]);
			 s=s+a[i];	
			 
			
		}
		System.out.println("sum of values is :"+s);
		System.out.println("length of array="+a.length);


	}

}
