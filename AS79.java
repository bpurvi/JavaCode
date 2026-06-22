//WAP on string functions length ,charAt() ,concat
package java_assignments;
import java.util.Scanner;
public class AS79 
{	
	public static void main(String[] args) 
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter String: ");
		String i1 = S1.next();
		System.out.println("Length of typed String is: "+i1.length());
		
		System.out.println("Enter index of Character: ");
		int i2 = S1.nextInt();
		System.out.println("Index of selected Character is: "+i1.charAt(i2));
		
		System.out.println("Enter string to concatinate: ");
		String i3 = S1.next();
		System.out.println("Concatinated result is: "+ i1.concat(i3));
	
		S1.close();
	}

}
