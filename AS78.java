//WAP to demonstrate the execution flow by including SIB, IIB, Main Method and Constructor in a single program.
package java_assignments;

public class AS78 
{
	AS78()
	{
		System.out.println("This is Constructor");
	}
	//SIB
	static
	{
		System.out.println("This is SIB block");	
	}
	//IIB
	{
		System.out.println("This is IIB Block");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is main method");
		new AS78();

	}

}
