package tutttts;
import java.util.Scanner;
class student{
	String name;
	int rollno;
	String trade;
	int sem;
	//class de andhr function
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name?");
		name=sc.next();//also read the blank spaces
		System.out.println("enter the roll no?");
		rollno=sc.nextInt();
		System.out.println("enter the trade?");
		trade=sc.next();
		System.out.println("enter the sem?");
		sem=sc.nextInt();
		
	}
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
}//end class student
class hyt{
	int feet;
	int inches;
	void in(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height in feet");
		feet=sc.nextInt();
		System.out.println("enter the height in inches");
		inches=sc.nextInt();
		if(inches>=12) {
			feet=feet+inches/12;
			inches=inches%12;
		}
			
}//end function1
	void inp(int f,int i) {
		feet=f; inches=i;
		if(feet>=12)
		{
			feet=feet+inches/12;
			inches=inches%12;
		}
	}//end of func 2
	void dis() {
		System.out.println("enter the height in feets"+feet);
		System.out.println("enter the height in inches"+inches);
		
	}//end of funct 3
	void displayli()
	{
		System.out.println(feet+"'" +inches+"\""); // double inerted comas iwe krayie de ne blackslash is escape sequence
	}//end of func
	void show() {
		System.out.println(feet+"\'"+inches+"\"");
	}
}//end of class
public class studentwthfunctionandclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1,s2;
		s1=new student();
		s2=new student();
		System.out.println("Enter details of student 1 :");
		s1.input();
		System.out.println("Enter details of student 2 :");
		s2.input();
		s1.displayline();
		s2.displayline();
		//end of student main
		hyt h1,h2;
		h1=new hyt();
		h2=new hyt();
		System.out.println("enter height first details:");
		h1.in();
		System.out.println("enter height second details:");
		h2.in();
		//h1.displayli();
		//h2.displayli();
		h1.show();
		h2.show();
	}

}
