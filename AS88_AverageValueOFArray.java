//WAP to find out the avarage of all the values present in the array
package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class AS88_AverageValueOFArray 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter size of an Arrays: ");
		double [] array1 = new double[s1.nextInt()];
		double sum = 0;
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Enter value at indexing: "+ i);
			array1[i]=s1.nextInt();
			sum = sum +array1[i];
		}
		System.out.println("Your array1 is:"+ Arrays.toString(array1));
		System.out.println("Total Sum is: "+ sum);
		double average = sum/array1.length;
		System.out.println("Total Average is: "+average);

	}

}
