package tutttts;
class stuudnt{
	private int rollno;
	private String name;
	private String trade;
	private int sem;
	private static int c=0;
	private static int d=0;
	public stuudnt()
	{
		rollno=0;
		name=null;
		trade=null;
		sem=0;
		c++;
		
	}
	public stuudnt(int rn,String nm,String tr, int semester)
	{
		rollno=rn;
		name=nm;
		trade=tr;
		sem=semester;
		d++;
	}
	public static int getcount()
	{
		return c;
	}
	public static int gettcount()
	{
		return d;
	}
}
//agr static h tn oo object da part ni hunda ; static object nl ni class nl refer krega sara classes lyi common member rhega 
// basic data type nu zero ni de skde s1 refrence 
//c will store current no. of objects 
//student class da count ha student refrence ya object da ni h
//static de andhr static hi use kr skde aw  non static member use ni kr skde 
//static member can directly involve wth class  name function apne aap nu call kr rha 
//static member can be called if no object is given
public class statick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stuudnt.getcount());
		stuudnt s1=new stuudnt();
		stuudnt s2=new stuudnt();
		stuudnt s3=new stuudnt();
		System.out.println(s1.getcount());
		stuudnt s4=new stuudnt();
		System.out.println(s1.getcount());
		System.out.println(stuudnt.getcount());

	}

}
