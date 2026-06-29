//WAP to check if the given string is anagram
package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class AS92 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your String 1: ");
		String name1 = s1.next();
		System.out.println("Enter your String 2: ");
		String name2 = s1.next();
		if(name1.length()!=name2.length())
		{
			System.out.println("Both of the strings are not anagram");
		}
		else
		{
			char [] c1 = name1.toCharArray();
			char [] c2 = name2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After sorting, Array 1 is:"+Arrays.toString(c1));
			System.out.println("After sorting, Array 2 is:"+Arrays.toString(c2));
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Both strings are anagram");
			}
			else
			{
				System.out.println("Both strings are not anagram");
			}			
		}
	}

}