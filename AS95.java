//WAP to Check in the given String how many are numeric present
package java_assignments;
import java.util.Scanner;

public class AS95 
{
	public static void main(String[] args) 
	{
		int count=0;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s2 = s1.next();
		char [] s3 = s2.toCharArray();
		for(int i=0;i<s2.length();i++)
		{
			boolean b1 = Character.isDigit(s3[i]);
			if(b1==true)
			{
				count++;
			}
		}
		System.out.println("Length of the String is: "+s2.length());
		System.out.println("No. of digits in the String is: "+count);
		
	}

}
