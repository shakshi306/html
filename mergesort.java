package basics;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-36,-18,12,-126,0,-33};
		sol(arr,0,arr.length-1);
		

	}
	public static int[] sol(int arr[],int lo,int hi)
			{
		int mid=(lo+hi)/2;
		int []left=sol(arr,lo,mid);
		int []right=sol(arr,mid+1,hi);
	    int []res= merge(left,right);
		return res;
			}
	

}
