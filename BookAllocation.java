package basics;
import java.util.Scanner;
public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		int lo=0;
		int val=0;
		for(int i=0;i<arr.length;i++)
		{
			val+=arr[i];
		}
		int hi=val;
		while(lo<=hi)
		{
				int mid=(lo+hi)/2;
		}

	}

}
