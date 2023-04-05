
package tutttts;
import java.util.Scanner;

public class callcenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cc =new Scanner(System.in);
		System.out.println("enter old reading");
		float or;
	    or=cc.nextFloat();
		System.out.println("enter new reading");
		float nr;
		nr=cc.nextFloat();
		float r;
		double nnr=0;
		r=nr-or;
		System.out.println("value of r:"+r);
		if(r<=200) 
			nnr=r*1.20;
			
		
//		if(r>=201&&r<=500) 
		else if(r<=500)
			//nnr=r*1;
			nnr=200*1.20+r-(200)*1.00;
			
		//if(r>=501&&r<=1000) 
		else if(r<=1000)
			//nnr=r*0.80;
			nnr=200*1.20+300*1.00+(r-500)*0.80;			
		//if(r>1000) 
			//nnr=r*0.60;
		     nnr=200*1.20+300*1.00+500*0.80+(r-100*0.60);
			System.out.print("the value of nnr:"+nnr);
      }

}
