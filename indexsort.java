package tutttts;
import java.util.Scanner;

public class indexsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
Scanner sc =new Scanner(System.in);
int[]a=new int[10];
int n=0;
for(int k=1;k<=5;k++)
{
	if(n==a.length)
	{
		System.out.print("not enough space");
		return; // or break
	
	}
	System.out.println("enter value ");
	value=sc.nextInt();
	int i=n;
	while(i>0 && a[i-1]>value)
	{
		a[i]=a[i-1];
		i--;
	}
	a[i]=value;
	n++;
}

for(int i=0;i<n;i++)
   System.out.println("values in array are:"+a[i]);

	}

}
