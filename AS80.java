//WAP on string function toUpperCase(), toLowerCase(), equal(), equalIgnoreCase(), Contain(), 
package java_assignments;

import java.util.Scanner;

public class AS80 
{
	public static void main(String[] args) 
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String i1 = S1.next();
		System.out.println("Uppercase String is: "+i1.toUpperCase());
		System.out.println("Lowercase String is: "+i1.toLowerCase());
		System.out.println("Enter String 2: ");
		String i2 = S1.next();
		System.out.println("Check enterded String is equal?: "+i1.equals(i2));
		System.out.println("Check enterded String is equal?: "+i1.equalsIgnoreCase(i2));
		
		String i3 = "Automation Testing";
		boolean i4 = i3.contains("testing");
		System.out.println("Does String contain the entered input?"+i4);
		
	}
}
