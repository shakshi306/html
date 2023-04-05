package tutttts;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
	//int a;
   int a;
	int b;
    int c;
    
    System.out.println("Namaste, Please give me first nhjumber you want to add ? ");
    a=scn.nextInt();
    System.out.println("Thanks, give me second value please ? ");
    b=scn.nextInt();
     c=a+b;
   // c=a-b;
   // c=a*b;
    //c=a/b;
   
    System.out.print("sum of "+a+" and "+b+" is "+c);

	}

}
