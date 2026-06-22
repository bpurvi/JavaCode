//WAP to Demonstrate More Than One Static Initialization Block (SIB)
package java_assignments;

public class AS74 
{
	static
	{
		System.out.println("This is SIB block 1 output");
	}
	static
	{
		System.out.println("This is SIB block 2 output");
	}
	static
	{
		System.out.println("This is SIB block 3 output");
	}
	static
	{
		System.out.println("This is SIB block 4 output");
	}
	static void method()
	{
		System.out.println("This is method output");
	}
	public static void main(String[] args) 
	{
		
		method();
	}

}
