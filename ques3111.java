package tutttts;
import java.util.Scanner;
public class ques3111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg=0;
		Scanner se= new Scanner(System.in);
		int s=0,a=0,count=0;
while(a!=-1) {
	System.out.println("enter no (-1 to quit)?");
	a=se.nextInt();
	//if(a!=-1) {
	 if(a==-1)
		break;
	s=s+a;
	count++;
	//}
	
	}
avg=s/count;
System.out.println("sum="+s);
System.out.println("count="+count);
System.out.println("avg="+avg);
	}

}
