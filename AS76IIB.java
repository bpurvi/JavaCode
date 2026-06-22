//WAP to demonstrate more than one instance initializing block (IIB)
package java_assignments;
public class AS76IIB 
{
	//IIB - instance intialising block 
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	AS76IIB()
	{
		System.out.println("Constructor 1");
	}
	{
		System.out.println("IIB 3");
	}
	public static void main(String[] args) 
	{
		new AS76IIB();
		System.out.println("Main Method");

	}


}
