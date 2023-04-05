package basics;
import java.util.Arrays;

public class aggressivecows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,8,4,9};
		Arrays.sort(arr);
		int lo=arr[0];
		int hi=arr[arr.length-1];
		while(lo<hi) {
			
		}
		int mid=(lo+hi)/2;
		boolean ans=isItPossible(arr,mid,3);
		if(ans==true)
		{
			lo=mid+1;
			
		}
		else {
			hi=mid-1;
			
		}
	}
		public static boolean isItPossible(int arr[],int mid,int noc) {
			int cpf=1;	
			int lp=0;
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]-arr[lp]>=mid)
				{
					cpf++;
					lp=i;
				}
			}
			if(cpf>noc) {
				
		}
		
	    	



}
    
    }
