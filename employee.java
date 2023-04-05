

//final nu koi chnge ni kr skda 
// final mns permanent or constant
// jiwe Math.pi  3.14 is constant krkr chck kro
//class de function final kr skde a  final ublic static void krke  ohh fr sub classes ch over ride ni hoyega 
// final class dedo super class ch tn oo never be extended in sub class fr error aayega
package tutttts;
import java.util.Scanner;

public class employee extends human {
	private int employeid;
	private String designation;
	private int salary;

	public employee()
	{
		employeid=salary=0;
		designation=null;
	}
	public employee(String desi,int id,String nam,int ag,String gen, int sal)
	{
		super(nam,ag,gen);
		designation=desi;
		salary=sal;
		employeid=id;
	}
	public void inputtdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		employeid=sc.nextInt();
		System.out.println("enter designation");
		designation=sc.next();
		System.out.println("enter salary");
		salary=sc.nextInt();
		input(); 
	}
	public void showw()
	{
		System.out.println("Designation="+designation);
		System.out.println("Employee id="+employeid);
		super.show();
		System.out.println("salary="+salary);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human h1,h2,h3;
		employee e1,e2,e3;
		h1=new human("mac",18,"male");
		e1=new employee();
		e2=new employee("software developer",21189054,"riya",19,"female",80000);
		
		//e1.showw();
		e2.showw();
		h2=e2;
		//e3=h1;error
		//e3=h2;error
		//e3=(employee)h1; exception
		e3=(employee)h2;
		if(e2==h1)
			System.out.println("false");
		if(e2==h2)
			System.out.println("True");
		
	}
}
//selection or exchange index bubble sort hogi