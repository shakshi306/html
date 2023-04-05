package tutttts;
import java.util.Scanner;//object is independent class is blue print ofan object
class comp{
	int real;
	int img;
}
class height{
	int feet;
	int inch;
	
}
class stud{
	String name;
	int rollno;
	String trade;
	int sem;
	
}

public class complex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comp x,y,z,w;
		//student refrences
		stud name,rollno,trade,sem;
		//add t;
		//height refrences
		height inch, feet;
		
		////t=new add(); // calling another class form this package only 
		//t.main(null);//calling class member
		Scanner sc=new Scanner(System.in);
		x= new comp();  // object bnda new nl
		y= new comp();
		z= new comp();
		w= new comp();
		//student making object
		name= new stud();
		rollno= new stud();
		trade= new stud();
		sem= new stud();
		// student making object finishes
		x.real=5;
		x.img=2;
		System.out.print("enter the y real part=");
		y.real=sc.nextInt();
		System.out.print("enter the y img part=");
		y.img=sc.nextInt();
		System.out.println("complex no. are:");
		System.out.println(x.real+" +i"+x.img);
		System.out.println(y.real+" +i"+y.img);
		//z=x+y give u error
		z.real=x.real+y.real;
		z.img=x.img+y.img;
		System.out.println("adding comp is "+z.real+" +i"+z.img);
			w.real=x.real*y.real;
		w.img=x.img*y.img;
		System.out.println("multiplying comp is "+w.real+" +i"+w.img);
		
		//student code
		stud st1,st2;
		st1= new stud();
		st2= new stud();
		System.out.println("enter the name of student");
		st1.name=sc.next(); // taking string from user
		System.out.println("enter the student roll no");
		st1.rollno=sc.nextInt();
		System.out.println("enter the trade of the student");
		st1.trade=sc.next();
		System.out.println("enter the student semester");
	    st1.sem=sc.nextInt();
	    System.out.println("data of first student=");
	    System.out.println("name of student="+st1.name);
	    System.out.println("roll no="+st1.rollno);
	    System.out.println("trade="+st1.trade);
	    System.out.println("sem="+st1.sem); 
	    //student 2
	    System.out.println("enter the name of  student");
		st2.name=sc.next(); // taking string from user
		System.out.println("enter the student roll no");
		st2.rollno=sc.nextInt();
		System.out.println("enter the trade of the student");
		st2.trade=sc.next();
		System.out.println("enter the  student semester");
	    st2.sem=sc.nextInt();
	    System.out.println("data of student second=");
	    System.out.println("name of the student = "+st2.name);
	    System.out.println("roll no of the student="+st2.rollno);
	    System.out.println("trade="+st2.trade);
	    System.out.println("sem="+st2.sem);
	 //   System.out.println("data of both the students is "+st1+" "+ st2);
	    //first height
	    feet= new height(); // object agge hmesha new lgda object bnaan lyi
		inch= new height();
	    height h1,h2;
	    h1= new height();
		h2= new height();
	    System.out.print("enter the value in feets");
		h1.feet=sc.nextInt();
		System.out.print("enter the value in inch");
		h1.inch=sc.nextInt();
		System.out.println("data of height one ");
		System.out.println(h1.feet+"'"+h1.inch);
		//System.out.println(h1.feet);
		//second height
		 System.out.print("enter the value in feet");
			h2.feet=sc.nextInt();
			System.out.print("enter the value in inch");
			h2.inch=sc.nextInt();
			System.out.println(h2.feet+"'"+h2.inch);

	   

	}

}
