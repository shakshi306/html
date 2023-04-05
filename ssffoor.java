package tutttts;

public class ssffoor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=3;a++)
		{
			for(int b=1;b<=3;b++)
			{
				
				for(int c=1;c<=3;c++)
					if(a!=b && b!=c && c!=a)// jo ik vr ni repeat ho re agr unhanu print krwana
					System.out.println(a+","+b+","+c);
			}
		}
		
//koi curly brackets di lorh ni h
	}

}
