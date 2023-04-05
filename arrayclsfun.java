package tutttts;
import java.util.Scanner;
class ar{
	 
		int arr[]=new int[10];
		int n=0;
		int size()
		{
			return n;
		}
		int capacity()
		{
			return arr.length;
		}
		void input()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("how many values you want to enter?");
			n=sc.nextInt();
			System.out.println("enter"+n+"values ");
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
		}
		void show()
		{
			System.out.println("values are:");
			for(int i=0;i<n;i++)
				System.out.println(arr[i]);
		}
		int getsum()
		{
			int s=0;
			for(int i=0;i<n;i++)
			s=s+arr[i];
		
		return s;
}
		int removeEnd()
		{ 
		
			
			int u=arr[n-1];
		  n--;
		  return u;
			
		}
		void insert(int v)
		{
			if(n==arr.length)
			{
				System.out.println("list is full")	;
				return;
				
			}
			arr[n]=v;
			n++;
		}
}
public class arrayclsfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		ar a;
		a=new ar();
		a.input();
		a.show();
		k=a.getsum();
		
		System.out.println("sum is:"+k);
		a.insert(18);
		a.insert(23);
		a.show();
		
		
	int	l=a.removeEnd();
		System.out.println("removed value is :"+l);
		a.show();

	}

}
