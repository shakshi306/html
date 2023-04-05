//agge extensions hundi ha saari properties inherit hunde h eg mobile isne mobile nu inherit krya wth adding more new features 
// super classs and sub class 
// human is base class mns super cls and student is derived class or extended class called sub class 
//every student is human bt human may or may not be student 

package tutttts;
import java.util.Scanner;
//final class human //base cls // error dau  //iddi descript. employee class ch diti  aw read it 
class human
{
	private String name;// string nu null dena hunda nd int nu zero kyuki aa string nu zero ni de skde zero is int 
    private int age;
    private String gender;
    
    public human() //default constructor
    {
    	name=null;
    	gender=null;
    	age=0;
    }
    public human(String nm,int a,String gen) // parameterized constructor
    {
    	name=nm;
    	age=a;
    	gender=gen;
    	
    }
    public void input()
    {
    	Scanner sc=new Scanner(System.in);// scanner is used only for functionality we cant declare it in class attributes kyuki fr oo meber or attribute bnju class da
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter age?");
        age=sc.nextInt();
        System.out.println("enter gender");
        gender=sc.next();
    }
 // final  public void show() error aau kyuki final mns permanent oo over ride ni krega ee error aayega
    public void show()
    {
    	
    	System.out.println("name="+name);
    	System.out.println("age="+age);
    	System.out.println("gender="+gender);
    	
    }
}
class stdt extends human // derived class
{
	private int rollno;
	private String trade;
	private int sem;
	
	public stdt() //default constructor
	{
		rollno=sem=0;
		trade=null;
	}
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter roll no");
		rollno=sc.nextInt();
		input(); // human class da input func calling 
		System.out.println("enter Trade?");
		trade=sc.next();
		System.out.println("enter semester");
		sem=sc.nextInt();
	}
	//public void display()
	public void show() // agr same name deda wth same no. of func and arg. //over riding show() method of human cls
	{
		System.out.println("rollno="+rollno);
		 // je kla show paawagey tn oo boht br roll no dikhake error dedu //recursion super paao kyuki human super cls ha tn je aapachahne aw oo human nu call kre super. nl define kro
		//show(); it will call student extends human functi.
		super.show();// show is over ridden func. which will over ride existing attribute 
		//super refers to super class with in subclass
		System.out.println("trade="+trade);
		System.out.println("sem="+sem);
		
	}
	public stdt(String nam,int ag,String gen,int rn,String tr,int semes)
	{
		//super keyword is used to refer super class wth in sub class . it is useful when we want to invoke over rdidden method of super class wth in sub class.It can also be used as first statement wthin cnstructor of sub class to invoke desired constructor of super class
		super(nam,ag,gen);
		rollno=rn;
		trade=tr;
		sem=semes;
	}
	
}// agr iko class ch function bnaana same no. nl tn diff parameteres hongey which is called overloading 

public class inheri {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		stdt s1,s2,s3;
		human h1,h2,h3;
	//human h=new human();
  h1=new human("sunny",34,"male");
//		h1.show();
		stdt s=new stdt();
		s.getdata();
		//s.display();
		s.show(); //human class da ha tn usde show krega ee call kr skda kyuki all human may or may not be student vli khaani
       //s.show student da ha kykui s student da obj ha
		//h1.show();
		//phla human class de constructor mns function chlngeyy frr student cls de 
	   s1=new stdt();
	   s2=new stdt("kritika",19,"female",486,"cse",3);
	   s1.show();//0 null 0 null null 0
	   s2.show();// 486,kritika,19,female,cse,3ee
	  // h1=new human("mack",6,"male");
	   h2=s2;
	   // two or more class is derived from super class is heirarical
	   //jdh sara ktha howe hybrid inheritence 
	   // two classes is derived from super class is multilevel
	   //single 
	   //do classes nu jorhke ik class ni bn skdi mns multilevel hirarch. is not allowed
	
   /// this is called runtime polymorphism jo runtime te pta chlega ksinu refer kr rha do same name vle funct. ch 
	// double qual to chck wther two refrences are refering to same object
	//s3=h1; // error
	//s3=h2;error
	//s3=(stdt)h1; exception error
	s3=(stdt)h2; //
	h1.show();// call to show() of human 
	h2.show();// call to show of student i.e h2 is referrring to student object
	if(s1==h2)
		System.out.println("False");// false
	if(s2==h2)
		System.out.println("true");// == checks whether two refrences are referring to same objcet
}
}
