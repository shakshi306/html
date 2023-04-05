package tutttts;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int n;
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("how many values you want to enter");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("enter the "+n+" values");
	    int f=a[i];
		int s=0;
		double avg=0.1;
		int big=a[0];
		int small=a[0];
		int c1=0;
		int c2=0;
		for(i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) 
		{
		
			if(a[i]>=big) // why here big
			big=a[i];
			if(a[i]<=a[0]) // not small 
				small=a[i];
			
		System.out.println("values you entred are:"+a[i]);
	 
		if(a[i]%2==0)
		{
			System.out.println("it is even="+a[i]);
			c1++;
		}
		
		else 
		{
			System.out.println("it is odd="+a[i]);
			c2++;
		}
			 s=s+a[i];
			 avg =(int)((s)/2);
		}
		System.out.println("sum of values is :"+s);
		System.out.println("length of array="+a.length);
		System.out.println("average of array="+avg);
		System.out.println("biggest no.="+big);
		System.out.println("smallest no.="+small);
		System.out.println("count of even no="+c1);
		System.out.println("count of odd no="+c2);
		
 }

}
