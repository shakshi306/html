package tutttts;
import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a[];
		a=new int[5];
		int i=0;
		int n;
		System.out.println("Enter the values to array");
		n=sc.nextInt();
		
		
	    int value;
	    System.out.println("Enter the "+ n+ " values");

	    for(i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
	    System.out.println("Enter the values to serach");
	    value=sc.nextInt();
	    int idx=-1;
	   // for( i=0;i<n;i++)
	    for(i=n-1;i>=0;i--)// ee vi last occ lyi
	    if(a[i]==value) 
	    	
	    {
	    	
	    	idx=i;
	    	System.out.println("Values found at index "+idx);
	    	//break;
	    	//break; last occ dekhn lyi
	    }
		if(idx==-1)
		
			System.out.println("Values are not found");
//		else
//			System.out.println("Values found "+idx);

	}
}
