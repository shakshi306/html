package tutttts;
import java.util.Scanner;
public class primenondfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
//		System.out.println("Enter the no.");
//		n=sc.nextInt();
		int count=0;
		
		double t;

		System.out.println("List of prime nos is :");
		
		for(n=1;n<=1000000;n++) 
		{
			count=0;
			t=Math.sqrt(n);
			//System.out.print("checking "+n+" ................... ");
			//	for(int i=2;i<n/2;i++) {  //agr speed tej krni ha nd tym jyada lg rha tn n/2 krlo kyuki highest factor ya no. hunda ya no. da half eg.50000=25000
			for(int i=2;i<=t;i++) {  // 8 to 10 sec speed baarbaa
				if(n%i==0) {
					//	System.out.println("factors found="+i);
					count++;
					break;//tnki sare factors h ya nhi oo na chck kre je ik h tn output dede
				}
				//	else
				//	System.out.println("not found="+i);
			}	
			//	System.out.println("no of factors="+count);
			if(count==0)
				System.out.print("\t "+n);
			//	else
			//		System.out.println("not prime "+n);
		}
	}
	}
		
		
	

