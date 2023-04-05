package tutttts;
class animal{
	static int count=0; //Static function srf apne ap nu call kr skda static srf cls da hunda object da ni hunda 
	String name;
	int age;
	String gender;
	
	public void input(String name,int a,String gen)
	{
		this.name=name; // agr name = name dwagey kla tn null show krega apne name nu hi refer krega 
		
		age=a;
		gender=gen;
	}
	public void display()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("gender="+gender);
	}

}


public class thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal A=new animal();
		A.input("Tom",5,"male");
		A.display();

	}

}
