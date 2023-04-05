package tutttts;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int v;
		                
		int d=0;
		for(v=1;v<=20;v++) {
		n=v; //ithe n di value zero hogi kyuki n not = 0 
		int c=0;
		while(n!=0) {
			c++;                        //count no of digits of v
			n=n/10;
		}
		
		n=v;  //v is orignl no n is copy of that // ithe taahi n dubara store krwaya kyuki while loop ch n di value zero hogi
		double sum=0;
		while(n!=0) {
			d=n%10;
			sum=sum + Math.pow(d,c);
			n=n/10;
		}
		if(sum==v)
			System.out.println("Armstrong no " +v);
		else
			System.out.println("Not Armstrong " +v);
	}
				
	}
}

