package tutttts;
import java.util.Scanner;
public class functionfact {
	Scanner sc=new Scanner(System.in);
	int t;
	
	public static int sum(int s)
	{
		if(s==0)
			return 0;
		return s+sum(s-1); // sum apne ap nu call kr rha thats why recursion
		// 2 values return ni kr skda function agr ik false ya true hoyegi ohi return krega  
	}
	
	public static int fact(int t)
	{
		if(t<=1)
			return 1;
		return t*fact(t-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k,n,f;
	System.out.print("enter the no.");
    n=sc.nextInt();
	
		k=fact(n);
		System.out.println("factorial="+k);
		f=sum(n);
		System.out.println("sum="+f);

	}

}
