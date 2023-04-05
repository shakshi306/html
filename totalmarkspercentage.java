package tutttts;

import java.util.Scanner;

public class totalmarkspercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//Scanner sc=new Scanner(System.in);
		int a1,a2,a3,total;
		double percentage;
		 System.out.println("enter first value");
		    a1=s.nextInt();
		 System.out.println("enter second value ");
		    a2=s.nextInt();
		 System.out.println("enter third value ");
		    a3=s.nextInt();
		    total=a1+a2+a3;
		    System.out.println("total:"+total);
		    percentage=total/450.0*100;
		    System.out.println("percentage:"+percentage);
		    //132,148,120
		
		

	}

}
