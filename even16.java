package tutttts;
import java.util.Scanner;
public class even16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scc=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=scc.nextInt();
		int a=2;
		double s =1;
		
		while(a<=n) {
			System.out.println("value of a="+a);
			s=s+(s-a);
      		a=a+2;//even no
			//a=a+2;//odd no
			
			System.out.println("sum="+s);

	}
 


	}

}
