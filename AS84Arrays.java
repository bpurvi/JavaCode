//WAP to accept the values of array at run time
package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class AS84Arrays
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int [] number = new int[s1.nextInt()];
		
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Enter value at index position: "+ number[i]);
			number[i]=s1.nextInt();
		}
		System.out.println("Final Array is:"+ (Arrays.toString(number)));
	//	System.out.println(Arrays.toString(number));
	}

}
