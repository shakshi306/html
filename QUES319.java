package tutttts;

import java.util.Scanner;

public class QUES319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scc=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=scc.nextInt();
		int a=1;
		
		//int fac=1;
//		fac=fac*a;
		double s =1;
		
		while(a<n) {
			System.out.println("value of a="+a);
			s=s+a/(a+1.0);
      		a=a+1;
			
			System.out.println("sum="+s); 
		}



	}

}
