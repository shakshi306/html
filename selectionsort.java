package tutttts;
import java.util.Scanner;
public class selectionsort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {7,8,3,1,2};
		for(int i=0;i<arr.length-1;i++) { //for passes ik ght chlu
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) { //for chcking inner loop j=i+1 kkyuki agle index toh chck kru na smallestg element tn swap hoke agge aagya 
				if(arr[smallest]>arr[j]) {
					//smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++)
		   System.out.println(" sorted array is "+arr[i]);
		
	}

}
