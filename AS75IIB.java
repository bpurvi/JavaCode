//WAP to demonstrate instance initializing block (IIB)
package java_assignments;

public class AS75IIB
{	
	AS75IIB()
	{
		System.out.println("Constructor 1");
	}
	//IIB - instance intialising block
	{
		System.out.println("IIB 1");
	}

	public static void main(String[] args) 
	{
		new AS75IIB();

	}

}
