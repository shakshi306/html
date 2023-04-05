package tutttts;
import java.util.Scanner;
class stu{
	
}
class studt{
	String name;
	int rollno;
	int sem;
	String trade;
	void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name?");
		name=sc.next();//also read the blank spaces
		System.out.println("enter the roll no?");
		rollno=sc.nextInt();
		System.out.println("enter the trade?");
		trade=sc.next();
		System.out.println("enter the sem?");
		sem=sc.nextInt();
	}//end of func 1
	void display()
	{
		System.out.println("Name="+ name);
		System.out.println("Roll No="+ rollno);
		System.out.println("Name="+ trade);
		System.out.println("Name="+sem);
		
	}
	void displayline()
	{    
		System.out.println(name+"\t"+rollno+"\t"+trade+"\t"+sem);
	}
}//end of classs student
public class arraystudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studt s[];
		s=new studt[2];
		int i;
		for( i=0;i<s.length;i++) 
		s[i]=new studt();
		System.out.println("enter details of 5 students");
		//end of 1 for loop
		for(i=0;i<s.length;i++) 
			s[i].input();
		//end of 2 loop
		for( i=0;i<s.length;i++) 
			s[i].displayline();
		//end of 3 loop
	
		
	}

}
