package tutttts;
public class stack
{
	private char a[];
	private int top ; // private is accesible only in class usnu user main ch use ni kr skda lyk x.top
public stack ()  //default const.
{
	a=new char[10];
	top=-1;
}
	//default constructor same name of class public honi chayidi ha no return type
public stack(int size) // parameterized constructor
{
	a=new char[size];
	top=-1;
}
public void push(char v)
{
	if(top==a.length-1)
		System.out.println("Stack overflow is full");
	else
	{
		top++;
		a[top]=v;
	}
	
}//end of func 1 
public char pop() //remove krke element vpis kita 
{
	char u;
	if(top==-1)// top value -1 tn stack chega ni 
	{
	System.out.println("stack is empty underflow");
	return '\0';
	}
	u=a[top];
	top--;
	return u;
}
public void show() //show krn lyi dubara top==-1 dita vrna oo chup hojnda
{
	if(top==-1)
		System.out.println("stack is empty");
	else
	{
		for(int i=0;i<=top;i++)
			System.out.println(a[i]);
	}
		
}
public char peakvalue()
{
	return a[top];
}
public void init() //to reset stack object for its initial state
{
	top=-1;  
}
}

/*public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//what is data structure
// collection of storage 
		//way of storage
		//which of operations are allowed
		 //linear ds...... way to visit each element ; linked list vi linear aw kyuki hr ik kol duja da address pya 2 kol 4 da ni hoyega 3 kol hoyega 
	 // stack is collection of data jiwe mrji store kro in linear way alowed operation ki jo new element add kragee tn oo last ch insert hoyega 
//top is where latest element is present
		// element 4 top value is 3 as er index 
		//removing mns pop adding mns push 
		//element vi serial vise insert krna pau kyuki stack bnani aw apa kitte vi element insert ni kr skdi 
		int t1,  t2;
		stck x,y,z;
		x=new stck();
		y=new stck();
		
		x.push(45);
		x.push(32);
		x.push(58);
		y.push(79);
		y.push(25);
		t1=x.pop();
		y.push(t1); //or y.push(x.pop())
		x.show();
		y.show();
		t1=x.peakvalue();
		t2=y.peakvalue();
		
		//System.out.print("peak value is="+t1);
		
		if(t1%2==0)
			System.out.println(t1+" is even");
		else
			System.out.println(t1+ "is odd");
		
		if(t2%2==0)
			System.out.println("it is even="+t2);
		else
			System.out.println("it is odd "+t2);
	}

}
*/