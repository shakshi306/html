package basics;
import java.util.Scanner;

public class hrmn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=-1;
		int x=(int)(Math.random()*100);
		//System.out.println(x);
		
		//do
		for(;n!=x;)
		{
		System.out.print("enter the no.");
		n=sc.nextInt();
		
		//System.out.println("the value of a random no."+x);
		if(n>x) 
			System.out.println("oops ur no. greater");
	
		else if(n<x && n>0) 
			System.out.println("oops ur no. is smaller");
		
		else  if(n==x)
			//{
			System.out.println("ur no.is correct");
			//break;  // break the loop
			//}
			
		else if(n<0)
		{
			//break;
			System.out.println("u should match nd ur no. was this="+x);
			break;
		
		}//while(n!=x && n>=0); // end repeated ask
			//break;
	}
		
	}}
