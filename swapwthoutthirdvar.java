package tutttts;
import java.util.Scanner;
public class swapwthoutthirdvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wv=new Scanner(System.in);
		int a,b;
		System.out.println("enter the value of a");
		a=wv.nextInt();
		System.out.println("enter the value of b");
		b=wv.nextInt();
		a=a+b;// 5+2=7
		b=a-b;//7-2=5
		a=a-b;//7-5=2
		System.out.println("the value of a after swap:"+a);
		System.out.println("the value of b after swap:"+b);
		
	
		

	}

}
