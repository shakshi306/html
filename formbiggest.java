package basics;
import java.util.Scanner;

public class formbiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++) {
				int val=biggest(arr[j],arr[j+1]);
				if(val==1)
				{
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			for(String val:arr) {
				System.out.print(val);
			}
		}
		public static int biggest(String s1,String s2)
		{
			String str1=s1+s2;
			String str=s2+s1;
			int a=Integer.parseInt(str1);
			int b=Integer.parseInt(str2);
			if(a-b<0) {
				return 1;
				
			}
			else {
				return 0;
			}
		}
		

	}

}
