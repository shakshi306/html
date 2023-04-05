package tutttts;
import java.util.Scanner;


public class quadraticsimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner qe=new Scanner(System.in);
		int a,b,c;
		int d;
		double x;
		double y;
		System.out.println("Enter the value of a:");
		 a=qe.nextInt();
		 System.out.println("Enter the value of b:");
		 b=qe.nextInt();
		 System.out.println("Enter the value of c:");
		 c=qe.nextInt();
	//	 System.out.println("Enter the value of x:");
//	 x=qe.nextDouble();
//		 System.out.println("Enter the value of y:");
//		 y=qe.nextDouble();
		// System.out.println("value of x is:"+x);
	    d=b*b-4*a*c;
	    System.out.println("the value of d is:"+d);
	    if(d>=0) {
	    	x=(-b+Math.sqrt(d))/(2*a);
	    	y=(-b-Math.sqrt(d))/(2*a);
	    	System.out.println("first root is :"+x);
	    	System.out.println("second root is : "+y);
	    	System.out.println("real");
	    }
	    else
	    	//System.out.print("imaginary of "+x+" and "+y);
	    System.out.println("imaginary");
		
		

	}

}
