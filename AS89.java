//WAP to chekc if 100 is a part of your array
package java_assignments;
import java.util.Arrays;
import java.util.Scanner;

public class AS89 
{
	public static void main(String[] args) 
	{
		int number = 100;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter size of an Arrays: ");
		int [] array1 = new int[s1.nextInt()];
		
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Enter value at indexing: "+ i);
			array1[i]=s1.nextInt();	
		}
		System.out.println("Your array1 is:"+ Arrays.toString(array1));	
		for(int i=0;i<array1.length;i++)
		{
			if(number==array1[i])
			{
				System.out.println("Yes, number is part of Array at indexing position: "+i);
			}
		/*	else
			{
				System.out.println("No, number is not part of Array");
			}*/
		}
	}

}
