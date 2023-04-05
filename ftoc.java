package tutttts;

import java.util.Scanner;

public class ftoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
				
		int fahrenheit,celsius;
		fahrenheit =sca.nextInt();
		//fahrenheit=24;
		celsius = ((fahrenheit-32)*5)/9;
		System.out.println("Temp.in celsius is:"+celsius);

	}

}
