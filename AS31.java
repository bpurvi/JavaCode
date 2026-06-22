//Assignment 31: WAP to Demonstrate Methods of the Scanner Class
package java_assignments;

import java.util.Scanner;

public class AS31 
{

	public static void main(String[] args) 
	{
		 Scanner s1=new Scanner(System.in);
		 System.out.println("Enter a String: ");
         String a= s1.next();
         System.out.println("Enter a Integer: ");
         int b= s1.nextInt();
         System.out.println("Enter a Float number: ");
         float f1=s1.nextFloat();
         System.out.println("Enter a Double number: ");
         double d=s1.nextDouble();
         System.out.println("Enter a Boolean: ");
         boolean b1=s1.nextBoolean();
         System.out.println("Enter a Short number: ");
         short e=s1.nextShort();
         System.out.println("Enter a Long : ");
         long h=s1.nextLong();
         System.out.println("Enter a Byte: ");
         byte j=s1.nextByte();
         System.out.println("Program End here");
         s1.close();
		
	}

}
