//WAP to copy the value of one array into another array
package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class AS86ArraysCopy 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter size of an Arrays: ");
		int [] array1 = new int[s1.nextInt()];
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Enter value at indexing: "+ i);
			array1[i]=s1.nextInt();
		}
		System.out.println("Your array1 is:"+ Arrays.toString(array1));
		
		int [] array2 = new int[array1.length];
		for(int i=0;i<array2.length;i++)
		{
			array2[i] = array1[i];
		}
		System.out.println("Your array2 is:"+Arrays.toString(array2));
	}

}
