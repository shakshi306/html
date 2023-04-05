package tutttts;
import java.util.Scanner;
public class stringcasesenscom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2 = "hELlO";
		//if(s1.equals(s2))//case sensitive
		if(s1.equalsIgnoreCase(s2))//ignore case
			System.out.println("True");
		else
			System.out.println("False");

	}

}
