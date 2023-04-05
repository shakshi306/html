package tutttts;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r,m;
		double pi = 3.14;
		
		System.out.println("enter the radius ");
		r=sc.nextInt();
		m = (int)(pi*r*r);
		System.out.println("Area of circle is "+m);
	}

}
