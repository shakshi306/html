package tutttts;

public class siroddeve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1=0,s2=0;  // take two variables to store sum of even and odd values, initialize both to 0
		int a=1;  // let a is 1, initialize a to 1
		while(a<=20)  // repeat below steps till a is less than 20
		{
			System.out.println("a = " +a);  // display current value of a being processed

           if(a%2==0)  // if a is even
			s1=s1+a;   // add a to s1
           else        //otherwise
             s2=s2+a;  //add a to s2
           
			a=a+1;  // increment a as next natural number
         }
		System.out.println("Sum of evenm values = " +s1 +" and odd values = "+s2);// display the final sum
		

	}


}


