//WAP to demonstrate Static Initialization Block (SIB)
package java_assignments;
public class AS73 
{
	static
	{
		System.out.println("This is SIB block output");
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
