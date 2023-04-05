package tutttts;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int arr[]= {18,5,16,15,2,12,4,9};
             int n=arr.length;
             //k element hai jis ch 1 phla hi pya hoyega 
             int k=1;
             int i=0;
             int val;
             while(k<n)
             {
            	 
            	  val=arr[k];
            	 for( i=k;i>0 && arr[i-1]>val;i--)
            		 arr[i]=arr[i-1];
            	 arr[i]=val;
            	 k++;
            		 
             }
             for(i=0;i<n;i++)
            	 System.out.println(arr[i]);
	}

}
