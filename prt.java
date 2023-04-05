package tutttts;

import java.util.Scanner;

public class prt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int P,R,T,a;
		System.out.println("enter the values");
		P=sc.nextInt();
		R=sc.nextInt();
		T=sc.nextInt();
		a= P*R*T/100;
		System.out.println("simple_interest "+a);


	}

}
