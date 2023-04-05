package tutttts;
import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a[]= {11,15,7,23,2};
		int t;
		
		for(int p=1;p<n;p++)
		for(int j=0;j<n-p;j++)
		{
			if( a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
		
		System.out.println("List after soring is : ");
		for(int j=0;j<n;j++)
			System.out.println(a[j]);	
		

	}

}


