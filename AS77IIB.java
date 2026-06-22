//WAP by creating 2 or multiple objects with multiple IIB blocks 
package java_assignments;

public class AS77IIB 
{
	//IIB - instance intialising block 
		{
			System.out.println("IIB 1");
		}
		{
			System.out.println("IIB 2");
		}
		{
			System.out.println("IIB 3");
		}
		AS77IIB()
		{
			System.out.println("Constructor 1");
		}
		
		public static void main(String[] args) 
		{
			new AS77IIB();
			new AS77IIB();
			System.out.println("Main Method");
			new AS77IIB();

		}
}
