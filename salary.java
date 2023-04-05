package tutttts;
import java.util.Scanner;
public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa = new Scanner(System.in);
		int bs;
		double da ;
		double ta ;
		double hra;
		double pf;
		System.out.println("value of bs");
		bs=sa.nextInt();
		
		 double ns;
		 
		    if(bs<5000) {
		    	da=bs*40.0/100;
		    	ta=bs*5.0/100;
		    	hra=bs*12.0/100;
		    	pf=bs*12.0/100;
		    	 
		    }
		    	
		    else if(bs>5001&&bs<=10000) {
		    		da=bs*45.0/100;
			    	ta=bs*5.0/100;
			    	hra=bs*15.0/100;
			    	pf=bs*12.0/100;
		    }
		    else if(bs>10001&&bs<=20000) {
		    	da=bs*40.0/100;
		    	ta=bs*5.0/100;
		    	hra=bs*12.0/100;
		    	pf=bs*8.0/100;
		    }
		    else 
		    {
		    	da=bs*40.0/100;
		    	ta=bs*5.0/100;
		    	hra=bs*12.0/100;
		    	pf=bs*8.0/100;
		    }
		   

	    	 System.out.println("value of da= "+da);
			 System.out.println("value of ta= "+ta);
			 System.out.println("value of hra= "+hra);
			 System.out.println("value of pf = "+pf);

//		    double ns;
		    ns=bs+da+ta+hra-pf;
		    System.out.print("value of ns"+ns);

		    


		

	}

}
