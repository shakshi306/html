package tutttts;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ly=new Scanner(System.in);
		System.out.println("enter the year");
		int y;
		y=ly.nextInt();
		if((y%4==0 && y%100!=0)|| y%400==0)
			System.out.println("it is  a leap year");
		else
			System.out.println("not a leap year");			
	}
					

	}

}
