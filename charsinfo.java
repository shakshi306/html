package tutttts;
import java.util.Scanner;
public class charsinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b;
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.print("Enter the  value of char");
		ch=sc.next().charAt(0);
		System.out.println("char is="+ch);
		if(ch>='A' && ch<='Z' )
			System.out.println("It is in upper case");
		else if(ch>='a' && ch<='z')
			System.out.println("It is in lower case");
		else if(ch>='0' && ch<='9')
			System.out.println("It is in number case");
		

	}

}
