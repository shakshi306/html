package basics;
import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int arr[]=new int[5];
		int noi=scn.nextInt();
		int pos=scn.nextInt();
		while(noi>0)
		{
			noi--;
			pos++;
			pos=pos%arr.length;
		}
		System.out.print(pos);

	}

}
