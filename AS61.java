//WAP to access Public, protected, default & private methods within a class
package java_assignments;

public class AS61 
{	
	public static void Add()
	{
		System.out.println("public method: Addition");
	}
	protected static void Sub()
	{
		System.out.println("protected method: Subtraction");
	}
	static void mul()
	{
		System.out.println("default method: Multiplication");
	}
	private static void div()
	{
		System.out.println("private method: Addition");
	}
	public static void main(String[] args) 
	{
		Add();
		Sub();
		AS61 a1 = new AS61();
		a1.mul();
		div();
	}

}
