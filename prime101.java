package tutttts;
import java.util.Scanner;
public class prime101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
//		System.out.println("Enter the no.");
//		n=sc.nextInt();
		int i;
		double t;

		System.out.println("List of prime nos is :");
		
		for(n=1;n<=1000000;n++) 
		{
			t=Math.sqrt(n);
			for(i=2;i<=t;i++) 
				if(n%i==0) 
					break;//tnki sare factors h ya nhi oo na chck kre je ik h tn output dede
			
			
			if(i>t)
				System.out.print("\t "+n);
		}
	}//end main
	}//end class
		
		
	


