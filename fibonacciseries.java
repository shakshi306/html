package tutttts;
import java.util.Scanner;
public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     	int a=0;
     	int b=1;
     	int c=0;
		for(int i=0;i<=10;i++) {
			System.out.println("fiboonacci series are"+c);
			a=b;
			b=c;
			c=a+b;		
		}       
	}

}
