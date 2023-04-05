package datatypes;

public abstract class Figure {
	double dim1; double dim2;
	Figure(double a,double b)
	{dim1=a;dim2=b;}
	abstract double area();
    }
class Rectangle extends Figure{
	    Rectangle(double a,double b)
	    {super(a,b);}
	    double area(){System.out.println("Inside Rectangle's Area");
	    return dim1*dim2;}
}
class Main3{
	public static void main(String[] args)
	{Recatangle r=new Rectangle(9,5);
	System.out.println("Area of Rectange is: "+r.area());}
		// TODO Auto-generated method stub
	}
