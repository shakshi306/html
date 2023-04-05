package tutttts;

import java.util.Scanner;

public class modifygrades16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//Scanner sc=new Scanner(System.in);222\
		int a1,a2,a3,total;
		double p;
		 System.out.println("enter first value");
		    a1=s.nextInt();
		 System.out.println("enter second value ");
		    a2=s.nextInt();
		 System.out.println("enter third value ");
		    a3=s.nextInt();
		    total=a1+a2+a3;
		    System.out.println("total:"+total);
		    p=total/450.0*100;
		    System.out.println("percentage:"+p);
		    //132,148,120
		if(p<0||p>100) {
			System.out.println("invalid marks");
		}
		if(p>=0&&p<40) {
			System.out.println("Fail");
			
		}
		if(p>=40&&p<50) {
			System.out.println("Grade D");
		}
		if(p>=50&&p<60) {
			System.out.println("Grade C");
		}
		if(p>=60&&p<70) {
			System.out.println("Grade B");
		}
		if(p>=70&&p<80) {
			System.out.println("Grade B+");
		}
		if(p>=80&&p<90) {
			System.out.println("Grade A");
		}
		if(p>=90&&p<=100) {
			System.out.println("Grade A+");
		}
	
	
	
	
	
	
		}	
	}


