//WAP to copy the value of one array into another array in the reverse order
package java_assignments;
import java.util.Arrays;
import java.util.Scanner;

public class AS87ArraysReverseCopy 
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
			
		for(int i=0,j=array1.length-1;i<array1.length;i++,j--)
		{
			array2[j]=array1[i];
		}
		
		System.out.println("Your array2 with reverser order is:"+Arrays.toString(array2));
	}

}
