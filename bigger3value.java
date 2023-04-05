package tutttts;
import java.util.Scanner;

public class bigger3value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
//		int s1=0;
//		int s2=0;
		Scanner bv=new Scanner(System.in);
		int a1;
		System.out.println("enter the value of a1");
		a1=bv.nextInt();
		int a2;
		System.out.println("enter the value of a2");
		a2=bv.nextInt();
//	int a3;// 3 grestest vla function h ni predefined math function nl
//    System.out.println("enter the value of a3");
//    a3=bv.nextInt();
				 s=Math.max(a1, a2);
		System.out.println("greatest value is="+s);
	}
}



		
	


