package tutttts;
import java.util.Scanner;
public class oddeven32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner oe=new Scanner(System.in);
		int i=1;
		int s1=0,s2=0;
		int n; 
		System.out.println("Enter the value of n");
		n=oe.nextInt();
		for( i=1;i<=n;i=i+1) {
//			if(i%2==0)
//				System.out.println("it is even="+s1+i);
//				else
//					System.out.println("it is odd="+s2+i);
			 if(i%2==0)  // if a is even
					s1=s1+i;   // add a to s1
		           else        //otherwise
		             s2=s2+i; 
			//i=i+1;
			}
		System.out.println("Sum of even values = " +s1 +" and odd values = "+s2);
		
	}
}
