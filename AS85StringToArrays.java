//WAP to convert string into array.
package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class AS85StringToArrays 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name = new String(s1.next());
		char [] c1 = name.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			System.out.println("String to char is: "+c1[i]);
		}
		System.out.println("String to Arrays is:"+Arrays.toString(c1));
	}

}
