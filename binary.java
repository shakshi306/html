package tutttts;
import java.util.Scanner;
public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int a[]= {5,6,7,8,9,10,11,12};
  int n=a.length;
  int val;  // jo search krni h
  System.out.print("enter the value for search");
  val=sc.nextInt();
  int start=0;
  int end=n-1;       
  int mid;
  int idx=-1; // agr value array ch ni h 
  while(start<=end) 
  {
	  mid=(start+end)/2;
  if(val==a[mid]) 
  { // array da mid h tn a[mid]
	  idx=mid;
	  break;                  
  }
  else if(val<a[mid])
	  end=mid-1; //  agr value chotti h tn end mnlagey
  else
	  start=mid+1; // agr value brhi h tn start mnke agge jawagey 
  }
  if(idx==-1)
	  System.out.print("value is not present in array="+idx);
  else
	  System.out.print("value is present in array at index ="+idx);
	  
	}

}
